import java.util.Scanner;

public class Main {

    public static int n;
    public static int[][] grid = new int[100][100];
    public static int[][] tempGrid = new int[100][100];
    // public static int[][] dp = new int[100][100];

    // 최솟값을 1부터 100까지 가정하고 풀어보기, 즉 dp에는 최댓값이 최소가 되는 값만 저장하면 됨
    // 대신 지나가는 경로는 최솟값보다 무조건 커야 함 -> 최솟값보다 작은 위치들은 INF 값을 줘서 선택되지 않도록 하기

    // INF 준다고 바꿔좋은 tempGrid를 다시 복구하는 함수 
    public static void initTempGrid() {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                tempGrid[i][j] = grid[i][j];
            }
        }
    }

    // 주어진 최솟값보다 작은 값들을 INF로 바꿔주는 함수
    public static void changeINF(int minVal) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (tempGrid[i][j] < minVal) tempGrid[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    // 최댓값이 최대한 적은 경로를 구하고 그 때의 최댓값을 반환하는 함수, 구할 수 없다면 -1 반환
    public static int findMin() {

        int[][] dp = new int[100][100];
        dp[0][0] = tempGrid[0][0];

        // 초기 조건 만들기
        for (int col=1; col<n; col++) {
            dp[0][col] = Math.max(dp[0][col-1], tempGrid[0][col]);
        }
        for (int row=1; row<n; row++) {
            dp[row][0] = Math.max(dp[row-1][0], tempGrid[row][0]);
        }

        for (int col=1; col<n; col++) {
            for (int row=1; row<n; row++) {
                dp[row][col] = Math.max(Math.min(dp[row-1][col], dp[row][col-1]) , tempGrid[row][col]);
            }
        }

        if (dp[n-1][n-1] == Integer.MAX_VALUE) return -1;
        else return dp[n-1][n-1];
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = 100;

        for (int minVal = 1; minVal<=100; minVal++) {
            initTempGrid();
            changeINF(minVal);
            int result = findMin();
            if (result != -1 && result - minVal < ans) ans = result - minVal;
        }

        System.out.print(ans);

    }
}
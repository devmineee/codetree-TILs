import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static int MAX_N = 500;
    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int[][] dp = new int[MAX_N][MAX_N];
    public static int n;

    public static int[] di = new int[]{-1,1,0,0};
    public static int[] dj = new int[]{0,0,1,-1};

    public static void fill_blank(int row, int col) {

        int value = dp[row][col]; // 가운데에 있는 값
        for (int i=0; i<4; i++) {
            // 범위 밖이면 가장자리이므로 계산하지 않음
            if (row+di[i] < 0 || row+di[i] >=n || col+dj[i] < 0 || col+dj[i] >= n ) continue;
            // 상하좌우의 숫자가 가운데보다 작거나 같으면 갈 수 없음
            if (arr[row+di[i]][col+dj[i]] <= arr[row][col]) continue;
            // 이미 상하좌우의 dp 값이 크다면 안 가도 됨
            if (dp[row+di[i]][col+dj[i]] > value+1) continue;

            dp[row+di[i]][col+dj[i]] = value + 1;
            fill_blank(row+di[i], col+dj[i]);
        }
    }

    public static boolean check_min(int row, int col) {

        for (int i=0; i<4; i++) {
            // 범위 밖이면 가장자리이므로 계산하지 않음
            if (row+di[i] < 0 || row+di[i] >=n || col+dj[i] < 0 || col+dj[i] >= n ) continue;
            if (arr[row+di[i]][col+dj[i]] < arr[row][col]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (check_min(i, j)) {
                    dp[i][j] = 1;
                    fill_blank(i,j);
                }
            }
        }

        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (dp[i][j] > ans) ans = dp[i][j];
            }
        }
        System.out.print(ans);
    }
}
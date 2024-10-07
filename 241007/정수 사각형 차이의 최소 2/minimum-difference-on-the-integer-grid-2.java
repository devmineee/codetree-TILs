import java.util.Scanner;

public class Main {

    public static int n;
    public static int[][] grid = new int[100][100];
    public static int[][] dpMin = new int[100][100];
    public static int[][] dpMax = new int[100][100];

    public static void initialize() {

        int colMin, colMax, rowMin, rowMax;
        colMin = colMax = rowMin = rowMax = grid[0][0];
        dpMin[0][0] = dpMax[0][0] = grid[0][0];

        for (int col=1; col<n; col++) {
            int value = grid[0][col];
            dpMin[0][col] = Math.min(value, dpMin[0][col-1]);
            dpMax[0][col] = Math.max(value, dpMax[0][col-1]);
        }

        for (int row=1; row<n; row++) {
            int value = grid[row][0];
            dpMin[row][0] = Math.min(value, dpMin[row][0]);
            dpMax[row][0] = Math.max(value, dpMax[row][0]);       
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        initialize();

        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {

                int value = grid[i][j];
                // 위쪽 블럭과 왼쪽 블럭을 비교해서 차이가 적은 것 선택
                // 위쪽 블럭의 최대 최소
                int upperMin = Math.min(dpMin[i-1][j], value);
                int upperMax = Math.max(dpMax[i-1][j], value);

                // 왼쪽 블럭의 최대 최소
                int leftMin = Math.min(dpMin[i][j-1], value);
                int leftMax = Math.max(dpMax[i][j-1], value);

                
                if (Math.abs(upperMax-upperMin) < Math.abs(leftMax-leftMin)) { // 위 블럭이 우세하다면
                    dpMin[i][j] = upperMin;
                    dpMax[i][j] = upperMax;
                }
                else {
                    dpMin[i][j] = leftMin;
                    dpMax[i][j] = leftMax;
                }
            }
        }

        System.out.println(Math.abs(dpMax[n-1][n-1]-dpMin[n-1][n-1]));

    }
}
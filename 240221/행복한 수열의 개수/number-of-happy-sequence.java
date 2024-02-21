import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int resultCnt = 0;

        for (int i=0; i<n; i++) {
            
            int col = arr[i][0];
            int row = arr[0][i];
            int colCnt = 1;
            int rowCnt = 1;

            for (int j=1; j<n; j++) {
                // 가로 arr[i][j]
                if (arr[i][j] == col) {
                    colCnt ++;
                }
                else {
                    colCnt = 1;
                }
                

                // 세로 arr[j][i]
                if (arr[j][i] == row) {
                    rowCnt ++;
                }
                else {
                    rowCnt = 1;
                }
            }

            if (colCnt >= m) {
                resultCnt ++;
            }
            if (rowCnt >= m) {
                resultCnt ++;
            }
        }
     System.out.print(resultCnt);   
    }
}
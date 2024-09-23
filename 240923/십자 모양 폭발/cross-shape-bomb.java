import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int powerOfBomb = arr[r][c];

        int[][] arrTemp = new int[n+1][n+1];

        for (int j=1; j<=n; j++) {

            if (j == c) { // 폭탄이 터진 열
                
                int tempArrayIdx = n;

                for (int i=n; i>=1; i--) {
                    if (r - powerOfBomb  < i && i < r + powerOfBomb) continue;

                    
                    arrTemp[tempArrayIdx][c] = arr[i][c];
                    tempArrayIdx --;
                }
            }

            else if (c - powerOfBomb < j && j < c + powerOfBomb) {
                int tempArrayIdx = n;
                for (int i=n; i>=1; i--) {
                    if (i == r) continue;
                    arrTemp[tempArrayIdx][j] = arr[i][j];
                    tempArrayIdx --;
                }
            }

            else {
                for (int i=1; i<=n; i++) {
                    arrTemp[i][j] = arr[i][j];
                }
            }
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(arrTemp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
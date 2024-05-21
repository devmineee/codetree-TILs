import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxVal = 0; // 최댓값 저장할 변수

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                // 격자의 가장 왼쪽에 있는 칸의 인덱스는 i,j임
                int sum = 0;
                for (int k=j; k<j+3; k++) {
                    if (k >= n) {continue;}
                    if (arr[i][k] == 1) sum ++;
                }
                if (sum > maxVal) {
                    maxVal = sum;
                }

            }
        }

        System.out.print(maxVal);
        


    }
}
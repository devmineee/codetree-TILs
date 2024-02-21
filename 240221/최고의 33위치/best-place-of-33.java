import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int a=0; a<=N-3; a++) {
            for (int b=0; b<=N-3; b++) {

                int sum = 0;
                for (int i=0; i<3; i++) {
                    for (int j=0; j<3; j++) {
                        if (arr[a+i][b+j] == 1) {
                            sum ++;
                        }
                    }
                }
                if (sum > max) {
                    max = sum;
                }




            }
        }




     System.out.print(max);   
    }
}
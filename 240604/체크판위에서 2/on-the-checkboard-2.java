import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int cnt = 0;
        char[][] arr = new char[R][C];
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        if (arr[0][0] != arr[R-1][C-1]) {

  for (int i=1; i<R-2; i++) {
            for (int j=1; j<C-2; j++) {

                if (arr[i][j] != arr[0][0] ) {
                    for (int k=i+1; k<R-1; k++) {
                        for (int l=j+1; l<C-1; l++) {
                            if (arr[k][l] != arr[i][j]) {
                                cnt ++;
                            }
                        }
                    }

                }

            }
        }

        }

    System.out.print(cnt);

        

    }
}
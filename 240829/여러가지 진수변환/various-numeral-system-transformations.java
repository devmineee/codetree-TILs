import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] notation = new int[20];

        int cnt = 0;

        for (int i=0; i<20; i++) {
            if (N < B) {
                notation[cnt++] = N % B;
                break;
            }

            notation[cnt++] = N % B;
            N /= B;

        }

        for (int i=cnt-1; i>=0; i--) {
            System.out.print(notation[i]);
        }
    }
}
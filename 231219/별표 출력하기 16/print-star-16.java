import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n * n;
        for (int i=n; i>0; i--) {

            for (int j=0; j<total-i*i; j++) {
                System.out.print(" ");
            }


            for (int j=0; j<i*i; j++) {
                System.out.print('*');
            }

            System.out.println();

        }
    }
}
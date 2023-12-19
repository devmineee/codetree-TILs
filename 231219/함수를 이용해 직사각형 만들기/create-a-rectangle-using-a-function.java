import java.util.Scanner;
public class Main {
    public static void rec(int r, int c) {
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print('1');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        rec(n,m);
    }
}
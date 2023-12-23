import java.util.Scanner;
public class Main {

    public static void func(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }

        if (n % 2 == 0) {
            n /= 2;
        }
        else {
            n /=3;
        }
        
        func(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}
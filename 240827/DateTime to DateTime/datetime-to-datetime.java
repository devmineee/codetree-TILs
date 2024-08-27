import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = (b*60 + c) - (11*60+11) + (a-11)*60*24;

        if (ans < 0) {ans = -1;}

        System.out.print(ans);
    }
}
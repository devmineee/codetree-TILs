import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i=0; i<n; i++) {
            str += sc.next();
        }
        String a = "";
        for (int i=0; i<str.length(); i++) {
            a += str.charAt(i);
            if (a.length() == 5) {
                System.out.println(a);
                a = "";
            }
        }
        if (a.length() != 0) {
            System.out.print(a);
        }
    }
}
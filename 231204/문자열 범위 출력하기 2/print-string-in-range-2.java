import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int len = str.length();
        int end;
        if (len-1-n < 0) {
            end = -1;
        }
        else {
            end = len-1-n;
        }
        for (int i=len-1; i>end; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
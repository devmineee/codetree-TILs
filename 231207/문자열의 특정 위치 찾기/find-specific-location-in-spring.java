import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = sc.next();
        int result = str.indexOf(a);
        if (result == -1) {
            System.out.print("No");
        }
        else {
            System.out.print(result);
        }
    }
}
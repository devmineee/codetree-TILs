import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            if (i%2 == 1) {
                newStr += str.charAt(i);
            }
        }
        for (int i=newStr.length()-1; i>-1; i--) {
            System.out.print(newStr.charAt(i));
        }
    }
}
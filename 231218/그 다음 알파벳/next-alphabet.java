import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        if (alphabet.charAt(0)=='z') {
            System.out.print('a');
        }
        else {
            int asc = (int)alphabet.charAt(0);
        System.out.print((char)(asc+1));
        }
    }
}
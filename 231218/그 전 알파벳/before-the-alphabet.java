import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        if (alphabet == 'a') {
            System.out.print('z');
        }
        else {

        System.out.print((char)((int)alphabet-1));
        }
    }
}
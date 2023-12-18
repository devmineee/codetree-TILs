import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String char1 = sc.next();
        String char2 = sc.next();
        int a = (int)char1.charAt(0);
        int b = (int)char2.charAt(0);
        
        int sum = a+b;
        int dif = a-b >0? a-b:b-a;
        System.out.print(sum +" "+dif);
    }
}
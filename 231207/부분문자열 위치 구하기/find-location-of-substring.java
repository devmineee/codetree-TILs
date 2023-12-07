import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        String objStr = sc.next();
        System.out.print(inputStr.indexOf(objStr));
    }
}
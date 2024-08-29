import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_binary = sc.next();
        int[] binary = new int[8];
        for (int i=0; i<input_binary.length(); i++) {
            binary[i] = Integer.parseInt(input_binary.substring(i,i+1));
        }
        int num = 0;
        for (int i=0; i<input_binary.length(); i++) {
            num = num * 2 + binary[i];
        }
        System.out.print(num);
    }
}
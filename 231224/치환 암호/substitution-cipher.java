import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rule = sc.nextLine();
        
        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) == ' ') {
                System.out.print(' ');
                continue;
            }

            int idx = rule.indexOf(str.charAt(i));
            idx += 97;
            System.out.print((char)idx);


        }
    }
}
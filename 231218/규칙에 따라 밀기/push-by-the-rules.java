import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String order = sc.next();
        int strLen = str.length();
        int orderLen  = order.length();

        for (int i=0; i<orderLen; i++) {

            if (order.charAt(i) == 'L') {
                str = str.substring(1) + str.substring(0,1);
            }
            else {
                str = str.substring(strLen-1) + str.substring(0,strLen-1);
            }
        }

        System.out.print(str);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i=0; i<str.length()-1; i++) {
            String subStr = str.substring(i, i+2);
            if (subStr.equals("ee")) {
                cnt1 ++;
            }
            if (subStr.equals("eb")) {
                cnt2 ++;
            }
        }
        System.out.print(cnt1 + " " + cnt2);
    }
}
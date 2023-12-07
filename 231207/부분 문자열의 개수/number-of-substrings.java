import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int cnt = 0;
        for (int i=0; i<A.length()-1; i++) {
            if (A.substring(i, i+2).equals(B)) {
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}
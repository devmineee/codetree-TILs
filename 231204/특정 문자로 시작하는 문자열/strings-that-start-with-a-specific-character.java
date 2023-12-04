import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        char alphabet = sc.next().charAt(0);
        // 문자열 개수 셀 변수 생성
        int cnt = 0;
        // 문자열 길이 합할 변수 생성
        int len = 0;
        for (int i=0; i<n; i++) {
            if (str[i].charAt(0) == alphabet) {
                cnt ++;
                len += str[i].length();
            }
        }
        double avg = len*100/cnt;
        System.out.print(cnt + " ");
        System.out.printf("%.2f", avg/100);
    }
}
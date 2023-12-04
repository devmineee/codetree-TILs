import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char a = str.charAt(0);
        int cnt = 1;
        String result = "";
        for (int i=1; i<str.length(); i++) {
            
            if (a == str.charAt(i)) {
            // 같은 숫자가 나오면 cnt 누적
                cnt ++;
            }
            else {
                // 다른 숫자가 나오면 숫자 기록 후 cnt 1로 초기화
                result += a;
                result += cnt;
                cnt = 1;
                a = str.charAt(i);
            }
            
        }
        result += a;
        result += cnt;
        System.out.println(result.length());
        System.out.print(result);

    }
}
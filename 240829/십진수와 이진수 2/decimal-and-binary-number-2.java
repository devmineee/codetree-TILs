import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int num = 0;
        // N을 십진수로 바꾸어 num에 저장
        for (int i=0; i< N.length(); i++) {
            num = num * 2 + (N.charAt(i) - '0');
        }
        // num을 17배 하기
        num *= 17;

        int cnt = 0;
        int[] binary = new int[15];

        while (true) {
            if (num < 2) {
                binary[cnt++] = num % 2;
                break;
            }
            binary[cnt++] = num % 2;
            num /= 2;
        }
        for (int i=cnt-1; i>-1; i--) {
            System.out.print(binary[i]);
        }
        
    }
}
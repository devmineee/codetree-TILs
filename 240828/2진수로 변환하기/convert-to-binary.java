import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 10만은 2의 20승은 되지 않으므로 여유롭게 설정
        int[] digits = new int[20];
        int cnt = 0;
        while (true) {
            if (n<2) {
                digits[cnt++] = n % 2;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        for (int i= cnt-1; i>-1; i--) {
            System.out.print(digits[i]);
        }

    }
}
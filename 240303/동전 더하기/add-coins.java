import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coin = new int[n];
        int k = sc.nextInt();
        for (int i=0; i<n; i++) {
            coin[i] = sc.nextInt();
        }

        int totalAmount = 0;

        for (int i=n-1; i>-1; i--) {

            // 동전 하나의 크기가 총 금액보다 크면 생략
            if (coin[i] > k) {
                continue;
            }

            while (coin[i] <= k) {
                k -= coin[i];
                totalAmount ++;
            }

        }
        System.out.print(totalAmount);
    }
}
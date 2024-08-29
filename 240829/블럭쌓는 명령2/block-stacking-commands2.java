import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] block = new int[N+1];
        for (int i=0; i<K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j=a; j<=b; j++) {
                block[j] += 1;
            }
        }

        int max_block = 0;
        for (int i=1; i<=N; i++) {
            if (max_block < block[i]) max_block = block[i];
        }
        System.out.print(max_block);
    }
}
import java.util.Scanner;

public class Main {

    public static int MAX_N = 100;
    public static int[][] a = new int[MAX_N][MAX_N];
    public static int[][] dp = new int[MAX_N][MAX_N];

    public static void initialize() {

        dp[0][0] = a[0][0];
        for (int i=1; i<MAX_N; i++) {
            dp[i][0] = dp[i-1][0] + a[i][0]; // 밑으로 꽉 채우기
            dp[0][i] = dp[0][i-1] + a[0][i]; // 옆으로 꽉 채우기
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        initialize();

        for (int i=1; i<N; i++) {
            for (int j=1; j<N; j++) {
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + a[i][j];
            }
        }

        int ans = Math.max(0, dp[N-1][N-1]);

        System.out.print(ans);

    }
}
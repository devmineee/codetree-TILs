import java.util.Scanner;

public class Main {
    
    public static int MAX_N = 100;
    public static int N;
    public static int[][] a = new int[MAX_N][MAX_N];
    public static int[][] dp = new int[MAX_N][MAX_N];

    public static void initialize() {
        dp[0][N-1] = a[0][N-1];

        for (int i=N-2; i>=0; i--) {
            dp[0][i] = dp[0][i+1] + a[0][i];
            dp[N-i-1][N-1] = dp[N-i-2][N-1] + a[N-i-1][N-1];
        }
    }

    public static void calulate() {

        for (int i=1; i<N; i++) {
            for (int j=N-2; j>=0; j--) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j+1]) + a[i][j];
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        initialize();
        calulate();

        int ans = Math.min(dp[N-1][0], Integer.MAX_VALUE);
        System.out.print(ans);

    }
}
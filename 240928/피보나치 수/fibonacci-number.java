import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static int[] memo = new int[46];


    public static int pibo(int index) {

        if (memo[index] != -1 ) return memo[index];


        if (memo[index-2] == -1) {
            pibo(index-2);
        }

        if (memo[index-1] == -1) {
            pibo(index-1);
        }

        memo[index] = memo[index-2] + memo[index-1];

        return memo[index];
    }


    public static void main(String[] args) {
        Arrays.fill(memo, -1);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo[1] = 1;
        memo[2] = 1;

        int ans = pibo(N);
        System.out.print(ans);

    }
}
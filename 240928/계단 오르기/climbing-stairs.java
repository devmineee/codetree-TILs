import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] memo = new int[1001];

    public static int stairs(int level) {


        if (level <= 3) {
            return memo[level];
        }

        else {
            memo[level] = stairs(level-2) + stairs(level-3);
        }

        return memo[level];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(memo, -1);
        int n = sc.nextInt();
        memo[1] = 0;
        memo[2] = 1;
        memo[3] = 1;

        System.out.print(stairs(n));


    }

}
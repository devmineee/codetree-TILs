import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[101];

        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for (int j=x1; j<=x2; j++) {
                line[j] ++;
            }
        }

        int max_num = 0;

        for (int i=1; i<101; i++) {
            if (max_num < line[i]) max_num = line[i];
        }

        System.out.print(max_num);
    }
}
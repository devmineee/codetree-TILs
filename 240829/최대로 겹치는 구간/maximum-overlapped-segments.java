import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[201];
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j=x1; j<x2; j++) {
                line[j] += 1;
            }
        }
        int max_line = 0;
        for (int i=0; i<201; i++) {
            if( max_line < line[i]) max_line = line[i];
        }
        System.out.print(max_line);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[201][201];
        for (int a=0; a<n; a++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int i=x1+100; i<x2+100; i++) {
                for (int j=y1+100; j<y2+100; j++) {
                    map[i][j] = 1;
                }
            }
        }
        
        int area = 0;
        for (int i=0; i<201; i++) {
                for (int j=0; j<201; j++) {
                    if (map[i][j] == 1) area++;
                }
        }

        System.out.print(area);

    }
}
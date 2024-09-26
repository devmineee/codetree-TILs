import java.util.Scanner;

public class Main {

    public static final int MAX_N = 200;
    public static final int MAX_M = 10;

    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] nextGrid = new int[MAX_N][MAX_N];


    public static void boom(int n, int col) {

        if (grid[n-1][col] == 0) return; // 가장 밑에 폭탄이 없는 경우
        
        int row = 0; // 가장 위 인덱스부터 폭탄이 존재하는 row 값 찾기 

        while (row < n-1) {
            // 폭탄이 존재하는 경우
            if (grid[row][col] != 0) break;
            row ++;
        }

        int power = grid[row][col];

        for (int i=n-1; i>= row + power; i--) {
            nextGrid[i][col] = grid[i][col];
        }

        for (int j=0; j<n; j++) {
            if (j == col) continue;
            if (col - power <j && j < col + power) {
                int idx = n-1;
                int tempIdx = n-1;

                while (idx >= 0) {
                    if (idx == row) idx--;
                    else {
                        nextGrid[tempIdx][j] = grid[idx][j];
                        tempIdx --;
                        idx --;
                        }
                }
            }

            else {
                for (int i=n-1; i>= 0 ; i--) {
                    nextGrid[i][j] = grid[i][j];
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = nextGrid[i][j];
                nextGrid[i][j] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<m; i++) {
            boom(n, sc.nextInt()-1);
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
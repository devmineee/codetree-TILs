import java.util.Scanner;

public class Main {

    public static final int MAX_N = 4;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] direction = new int[MAX_N][MAX_N];

    public static int n;
    public static int maxTime = 0;

    public static boolean inRange(int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= n) return false;
        return true;
    }

    public static void find(int r, int c, int recur) {

        int[] di;
        int[] dj;

        int dir = direction[r][c];
        
        if (dir == 1) {
            di = new int[]{-1,-2,-3,-4};
            dj = new int[]{0,0,0,0};
        }
        else if (dir == 2) {
            di = new int[]{-1,-2,-3,-4};
            dj = new int[]{1,2,3,4};
        }
        else if (dir == 3) {
            di = new int[]{0,0,0,0};
            dj = new int[]{1,2,3,4};
        }
        else if (dir == 4) {
            di = new int[]{1,2,3,4};
            dj = new int[]{1,2,3,4};
        }
        else if (dir == 5) {
            di = new int[]{1,2,3,4};
            dj = new int[]{0,0,0,0};
        }
        else if (dir == 6) {
            di = new int[]{1,2,3,4};
            dj = new int[]{-1,-2,-3,-4};
        }
        else if (dir == 7) {
            di = new int[]{0,0,0,0};
            dj = new int[]{-1,-2,-3,-4};
        }
        else {
            di = new int[]{-1,-2,-3,-4};
            dj = new int[]{-1,-2,-3,-4};
        }

        for (int i=0; i<4; i++) {
            if (!inRange(r+di[i], c+dj[i])) continue; // 범위 밖일 때
            if (grid[r][c] >= grid[r+di[i]][c+dj[i]]) continue; // 숫자가 작아서 갈 수 없는 숫자일때

            find(r+di[i], c+dj[i], recur+1);
        }

        if (recur > maxTime) maxTime = recur;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                direction[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        find(r-1,c-1,0);
        System.out.print(maxTime);
    }
}
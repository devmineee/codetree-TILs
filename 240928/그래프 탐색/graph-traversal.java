import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static int[][] adj = new int[1001][1001];
    public static int[] visited = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i=0; i<M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj[x][y] = 1;
            adj[y][x] = 1;
        }

        stack.add(1);

        int ans = -1;

        while (!stack.isEmpty()) {

            int u = stack.remove(0);
            visited[u] = 1;

            for (int i=1; i<=N; i++) {
                if (adj[u][i] == 1 && visited[i] == 0) {
                    stack.add(i);
                }
            }
        }

        
        for (int i=1; i<=N; i++) {
            if (visited[i] == 1) ans ++;
        }

        System.out.print(ans);

    }
}
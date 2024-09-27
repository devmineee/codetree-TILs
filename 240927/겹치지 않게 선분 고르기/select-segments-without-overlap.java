import java.util.Scanner;
// 골랐으면 다
public class Main {

public static final int MAX_N = 15;

public static int[] line = new int[1001]; // 겹치는 것을 표기할 선분 배열

public static int[] x1 = new int[MAX_N];
public static int[] x2 = new int[MAX_N];

public static int ans = 0;


public static boolean isOverlap(int start, int end){

    for (int i=start; i<=end; i++) {
        if (line[i] == 1) {
            return true;
        }
    }

    return false;
}

public static void markLine(int start, int end) {
    for (int i=start; i<=end; i++) {
        line[i] = 1;
    }
}

public static void unMarkLine(int start, int end) {
    for (int i=start; i<=end; i++) {
        line[i] = 0;
    }
}

public static void choose(int n, int v, int recur) {


    for (int i=v; i<n; i++) {
        
        if (!isOverlap(x1[v], x2[v])) {

            if (ans < recur + 1) ans = recur + 1;

            markLine(x1[v], x2[v]);
            choose(n, i+1, recur+1);
            unMarkLine(x1[v], x2[v]);
        }
    }
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        choose(n, 0, 0);
        System.out.print(ans);
    }
}
import java.util.Scanner;

public class Main {


    public static int n = 0;
    public static int m = 0;
    public static int[][] line = new int[16][16];
    public static int[] result = new int[16];
    public static int[][] newLine = new int[16][16];


    public static int radder(int lineNum) {
        int currentLine = lineNum;
        int currentHigh = 1;
        while (currentHigh <= 15) {
            if (line[currentLine][currentHigh] == 1) currentLine ++; // 오른쪽의 라인과 연결되어 있는 경우 오른쪽으로 이동
            else if (line[currentLine-1][currentHigh] == 1) currentLine --; // 왼쪽의 라인과 연결되어 있는 경우 왼쪽으로 이동
            currentHigh ++; // 한칸 올라가기
        }
        return currentLine;
    }

    public static boolean isSameResult() {

        for (int i=1; i<=n; i++) {
            if (result[i] != radder(i)) return false;
        }

        return true;
    }

    public static boolean choose(int lineLimit, int usedLine, int startX, int startY ) {

        if (lineLimit == usedLine) {
            if (isSameResult()) return true;
        }

        else {
            // 같은 라인에서 세로줄 0개 ~ m개 사용할 수도 있음
            for (int i=1; i<=n-1; i++) { // 맨 오른쪽 라인은 갈 곳이 없음
                if (i < startX) continue;
                for (int j=1; j<=15; j++) {
                    
                    if (i == startX && j <= startY) continue;

                    if (line[i][j] == 1) continue; // 이미 마킹되어있는 것은 제외
                    if (line[i-1][j] == 1 || line[i+1][j] == 1) continue; //왼쪽 오른쪽 벽이 마킹되어있는 것은 제외
                    
                    line[i][j] = 1;

                    if (choose(lineLimit, usedLine+1, i, j)) return true;

                    line[i][j] = 0;
                }
            }
        }
        return false; // 해당 밧줄 리미트에서는 같은 결과값 없음
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            line[a][b] = 1;
        }

        for (int i=1; i<=n; i++) {
            result[i] = radder(i);
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=15; j++) {
                line[i][j] = 0;
            }
        }

        int lineLimit = 0;

        while (lineLimit < m) {
            if (choose(lineLimit, 0, 0, 0)) break;
            lineLimit ++;
        }

        System.out.print(lineLimit);



    }
}
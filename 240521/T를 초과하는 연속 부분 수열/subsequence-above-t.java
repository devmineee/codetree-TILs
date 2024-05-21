import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int max = 0; // 최대 길이를 저장할 변수
        int currentCnt = 0;

        for (int i=0; i<n; i++) {

            int currentNum = sc.nextInt();

            if (currentNum > t) {
                currentCnt ++;
            }
            else {
                if (max < currentCnt) {
                    max = currentCnt;
                    currentCnt = 0;
                }
            }
        }
        if (max < currentCnt) {
            max = currentCnt;
            currentCnt = 0;
        }

        System.out.print(max);
    }
}
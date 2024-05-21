import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 1;
        int currentCnt = 1;
        int headNum = sc.nextInt();
        for (int i=1; i<N; i++) {

            int currentNum = sc.nextInt();

            // 맨 앞의 값과 받은 값의 차가 양수가 아하므로 로직 실행
            if (headNum >= currentNum) {
                // 현재 횟수가 최댓값을 보다 크면 갱신
                if (max < currentCnt) {
                    max = currentCnt;
                }
                currentCnt = 1;     // 카운트한 횟수 초기화

            }
            else currentCnt ++;
            headNum = currentNum;   // headNum 초기화
        }

        if (max < currentCnt) {
            max = currentCnt;
        }

        System.out.print(max);
    }
}
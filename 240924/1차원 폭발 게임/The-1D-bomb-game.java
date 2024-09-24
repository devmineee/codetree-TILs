import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100;
    public static final int MAX_M = 100;
    public static int[] arr = new int[MAX_N+1];

    public static boolean isBoom(int idx, int M) {
        int count = 1; // 최초 카운트는 자기자신 1
        while (true) {
            if (idx + count > 100) break;
            if (arr[idx] == 0) break;
            if (arr[idx+count] != arr[idx] || count == M) break;
            count ++;
        }
        if (count < M) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 입력
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] tempArr = new int[MAX_N+1];
        boolean isBoomed = false;
        do {
            isBoomed = false;
            int tempIdx = 0;
            int idx = 0;
            while (idx <= 100) {
                if (isBoom(idx, M)) {
                    while (idx < 100 && arr[idx] == arr[idx+1]) idx ++;
                    idx ++;
                    isBoomed = true;
                    continue;
                }
                tempArr[tempIdx] = arr[idx];
                tempIdx ++;
                idx ++;
                if (idx == MAX_N) break;
            }

            for (int i=0; i<MAX_N; i++) {
                arr[i] = tempArr[i];
                tempArr[i] = 0;
            }
        } while (isBoomed);
        int boomNum = 0;
        for (int i=0; i<N; i++) {
            if (arr[i] == 0) break;
            boomNum ++;
        }

        System.out.println(boomNum);

        for (int i=0; i<boomNum; i++) {
            System.out.println(arr[i]);
        }

      



        


    }
}
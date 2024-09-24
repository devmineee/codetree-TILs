import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100;
    public static final int MAX_M = 100;
    public static int[] arr = new int[MAX_N+1];

    public static boolean isBoom(int idx, int M) {

        if (arr[idx] == 0) return false; // 폭탄이 없을 경우 터지지 않음
        if (idx + M >= MAX_N ) return false; // 배열 최대 크기보다 갯수가 작을 경우 터지지 않음
        
        int count = 1; // 최초 카운트는 자기자신 1
        while (idx + count <= MAX_N) {
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

        boolean isBoomed = true;

        while (isBoomed) {
            isBoomed = false;
            int tempIdx = 0;
            int idx = 0;
            while (idx < N) {
                if (isBoom(idx, M)) {
                    while (arr[idx] == arr[idx+1]) idx++;
                    idx++;
                    isBoomed = true;
                }
                else {

                    while (idx < N && arr[idx] == arr[idx+1]) {
                        tempArr[tempIdx] = arr[idx];
                        tempIdx ++;
                        idx ++;
                    }
                    tempArr[tempIdx] = arr[idx];
                    tempIdx ++;
                    idx ++;
                }
            }
            for (int i=0; i<N; i++) {
                arr[i] = tempArr[i];
                tempArr[i] = 0;
            }
        }

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
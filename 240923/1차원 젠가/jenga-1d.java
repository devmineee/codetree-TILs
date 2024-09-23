import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1]; // 1번 인덱스부터 세기 위해
        for (int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        int[] arrTemp = new int[n+1]; // temp 배열 생성

        int endOfTemp = 0; // 원소가 저장된 마지막 인덱스를 저장할 변수 생성
        for (int i=1; i<=n; i++) {
            if (s1<=i && i<=e1) continue;
            endOfTemp ++;
            arrTemp[endOfTemp] = arr[i];
            
        }

        int[] secondTemp = new int[endOfTemp+1];
        int endOfSecondTemp = 0;
        for (int i=1; i<=endOfTemp; i++) {
            if (s2<=i && i<=e2) continue;
            endOfSecondTemp ++;
            secondTemp[endOfSecondTemp] = arrTemp[i];
            
        }

        System.out.println(endOfSecondTemp);
        for (int i=1; i<=endOfSecondTemp; i++) {
            System.out.println(secondTemp[i]);
        }
    }
}
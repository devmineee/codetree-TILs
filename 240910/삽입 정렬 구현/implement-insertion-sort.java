import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[100];
        int size = 0;
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            size ++;
            list[size -1] = num; // 맨 마지막 인덱스에 일단 숫자 저장
            
            for (int idx = size - 2; idx >= 0; idx --) {
                if (list[idx] <= list[idx+1]) break;
                int temp = list[idx];
                list[idx] = list[idx+1];
                list[idx+1] = temp;
            }
        }

        for (int i=0; i<size; i++) {
            System.out.print(list[i]+ " ");
        }

    }
}
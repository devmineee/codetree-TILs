import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            pq.add(-num);
        }
        for (int i=0; i<m; i++) {
            // 음수화되어있는 수
            int thisNum = pq.poll();
            // 하나빼는게 음수에선 더하는거
            thisNum ++;
            // 다시 넣기
            pq.add(thisNum);
        }
        
        System.out.print(pq.peek()*(-1));
        
    }
}
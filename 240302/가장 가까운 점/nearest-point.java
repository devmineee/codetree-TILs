import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {

    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair pair){
        
        if (Math.abs(this.x) + Math.abs(this.y) == (Math.abs(pair.x) + Math.abs(pair.y))) {
            return Math.abs(this.x) - Math.abs(pair.x);
        }
        
        return Math.abs(this.x) + Math.abs(this.y) - (Math.abs(pair.x) + Math.abs(pair.y));
    }
}


public class Main {
    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair pair = new Pair(x,y);
            pq.add(pair);
        }

        for (int i=0; i<m; i++) {
            Pair pair = pq.poll();
            pair.x += 2;
            pair.y += 2;
            pq.add(pair);
        }
        Pair pair = pq.peek();
        System.out.print(pair.x + " " + pair.y);
    }
}
import java.util.Arrays;
import java.util.Scanner;


class Distance implements Comparable<Distance>{
    int x;
    int y;
    int idx;
    int dist;
    public Distance(int x, int y, int idx) {
        this.x=x;
        this.y=y;
        this.idx=idx;
        
        if (x<0) {
            if (y<0) {
                this.dist = -x-y;
            }
            else {
                this.dist = y-x;
            }
        }
        
        else {
            if (y<0) {
                this.dist = x-y;
            }
            else {
                this.dist = y+x;
            }
        }
        
    }

    @Override
    public int compareTo(Distance distance) {
        return this.dist - distance.dist;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Distance[] distances = new Distance[N];
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            distances[i] = new Distance(x,y,i+1);
        }
        Arrays.sort(distances);
        
        for (int i=0; i<N; i++) {
            System.out.println(distances[i].idx);
        }
        
    }
}
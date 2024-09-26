import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> ans = new ArrayList<>();

    public static void choose(int maxNum, int maxTime, int currTime) {
        
        if (currTime == maxTime) {
            for (int i=0; i<ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=maxNum; i++) {
            ans.add(i);
            choose(maxNum, maxTime, currTime + 1);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        choose(K, N, 0);
    }
}
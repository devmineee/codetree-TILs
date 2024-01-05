import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
         

        for (int i=0; i<N; i++) {

            String order = sc.next();

            if (order.equals("push_back")) {
                int num = sc.nextInt();
                arr.add(num);
            }

            else if (order.equals("pop_back")) {
                arr.remove(arr.size()-1);
            }

            else if (order.equals("size")) {
                System.out.println(arr.size());
            }

            else if (order.equals("get")) {
                int num = sc.nextInt();
                System.out.println(arr.get(num-1));
            }

        }

    }
}
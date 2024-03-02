import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i=0; i<N; i++) {
            String order = sc.nextLine();
            char orderChar = order.charAt(0);
            if (orderChar == 'p') {

                if (order.charAt(1) == 'u') {

                    String[] arr = order.split(" ");
                    pq.add(Integer.parseInt(arr[1])*(-1));

                }

                else {
                    System.out.println(Math.abs(pq.poll()));
                }


            } else if (orderChar == 's') {
                System.out.println(pq.size());
            } else if (orderChar == 'e') {
               if (pq.isEmpty()) {
                System.out.println(1);
               }
               else {
                System.out.println(0);
               }
            } else if (orderChar == 't') {
                System.out.println(Math.abs(pq.peek()));
            }

        }
        }
    }
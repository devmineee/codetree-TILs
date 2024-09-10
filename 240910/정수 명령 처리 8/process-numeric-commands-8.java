import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();

        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            String command = sc.next();

            if (command.equals("push_front")) {
                int num = sc.nextInt();
                l.addFirst(num);
            }

            else if (command.equals("push_back")) {
                int num = sc.nextInt();
                l.addLast(num);
            }

            else if (command.equals("pop_front")) {
                int num = l.pollFirst();
                System.out.println(num);
            }

            else if (command.equals("pop_back")) {
                int num = l.pollLast();
                System.out.println(num);
            }

            else if (command.equals("size")) {
                System.out.println(l.size());
            }
            else if (command.equals("empty")) {
                if (l.isEmpty() == true) System.out.println("1");
                else System.out.println("0");
            }
            else if (command.equals("front")) {
                System.out.println(l.peekFirst());               
            }
            else if (command.equals("back")) {
                System.out.println(l.peekLast());
            }
        }
    }
}
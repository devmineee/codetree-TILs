import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String recipe = sc.next();
        for (int i=0; i<n; i++) {
            l.add(recipe.charAt(i));
        }
        ListIterator<Character> it = l.listIterator(l.size());

        for (int i=0; i<m; i++) {
            String command = sc.next();
            if (command.equals("L")) {
                if (it.hasPrevious()) it.previous();
            }
            else if (command.equals("R")) {
                if (it.hasNext()) it.next();
            }
            else if (command.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }

            else if (command.equals("P")) {
                char alphabet = sc.next().charAt(0);
                it.add(alphabet);
            }
        }

        while (it.hasPrevious()) it.previous();
        while (it.hasNext()) System.out.print(it.next()); 

    }
}
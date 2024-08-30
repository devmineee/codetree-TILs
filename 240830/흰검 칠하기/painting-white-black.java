import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder[] tiles = new StringBuilder[200000];

        for (int i=0; i<200000; i++) {
            tiles[i] = new StringBuilder(" ");
        }
        int current_position = 100000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j=current_position; j>current_position- x; j--) {
                    tiles[j].append("w");
                }
                current_position = current_position - x + 1;
            }

            else if (dir == 'R') {
                for (int j=current_position; j<current_position+x; j++) {
                    tiles[j].append("b");
                }
                current_position = current_position + x - 1;
            }
        }

        int ans_gray = 0;
        int ans_white = 0;
        int ans_black = 0;

        for (int i=0; i<200000; i++) {
            
            int white = 0;
            int black = 0;
            for (int j=0; j<tiles[i].length(); j++) {
                if (tiles[i].charAt(j) == 'w') white++;
                else if (tiles[i].charAt(j) == 'b') black++;
            }
            
            if (white >= 2 && black>=2) {
                ans_gray ++;
            }
            else {
                char last_color = tiles[i].charAt(tiles[i].length()-1);
                if (last_color == 'b') ans_black++;
                else if (last_color == 'w') ans_white ++;
            }


        }

        System.out.print(ans_white + " " + ans_black + " " + ans_gray);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tile = new int[200001]; // 최대한 갈 수 있는 타일의 범위
        int current_position = 100000; 
        for (int i=0; i<n; i++) {
            int dist = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                while (dist > 0) {
                    tile[current_position] = 1; // 은 흰색
                    current_position --;
                    dist --;
                }
                current_position ++;
            }

            else if (dir == 'R') {
                while (dist > 0) {
                    tile[current_position] = 2; // 2는 검은색
                    current_position ++;
                    dist --;
                }
                current_position --;
            }
        }
        
        int white_tile = 0;
        int black_tile = 0;
        for (int i=0; i<200001; i++) {
            if (tile[i] == 1) white_tile ++;
            else if (tile[i] == 2) black_tile ++;
        }

        System.out.print(white_tile + " " + black_tile);
    }
}
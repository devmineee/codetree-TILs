import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 이동할 수 있는 최대 범위는 조건 상 -1000 부터 +1000 까지임
        // 편의 상 0에서 2000까지로 인덱스로 잡기로.
        int[] area = new int[2001];

        int current_position = 0;

        for (int j=0; j<n; j++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int i=current_position-1 + 1000; i>current_position-1+1000-x; i--) {
                    area[i] ++;
                }
                current_position = current_position - x;
            }

            else if (dir == 'R') {
                for (int i=current_position+1000; i<current_position+1000+x; i++) {
                    area[i] ++;
                }
                current_position = current_position + x;
            }
        }

        int ans_area = 0;

        for (int i=0; i<2001; i++) {
            if (area[i] >= 2) ans_area ++;
        }

        System.out.print(ans_area);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        String[] days = new String[]{"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] days_of_month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int A_day_num = 0;

        // A 요일이 day 배열의 몇 번 인덱스인지 확인
        for (int i = 1; i<8; i++) {
            if (days[i].equals(A)) {
                A_day_num = i;
                break;
            }
        }

        
        int total_days = 1;

         // m1월 d1일 부터 m2월 d2일까지는 총 며칠 있는가?
         while (true) {

            if (m1 == m2 && d1 == d2) {
                break;
            }

            d1 ++;
            total_days ++;

            if (d1 > days_of_month[m1]) {
                m1 ++;
                d1 = 1;
            }
        }

        int ans = 0;
        total_days -= (A_day_num - 1);
        if (total_days >= 1) {
            ans = total_days / 7 + 1;
        }
        System.out.print(ans);

    }
}
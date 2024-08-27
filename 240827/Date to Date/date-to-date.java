import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 입력 받기
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 월 별 일자 계산
        int[] days_of_month = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        // 총 며칠인지 저장하는 변수
        int total_days = 1;

        while(true) {
            // m1과 d1이 각각 m2와 d2와 똑같아질 때 까지 d1을 하나씩 올릴것임

            // 같아지면 종료
            if (m1 == m2 && d1 == d2) break;

            total_days ++;
            d1 ++;

            // 다음달로 넘어간 경우 변경해주기
            if (days_of_month[m1] < d1) {
                m1 ++;
                d1 = 1;
            }
        }

        System.out.print(total_days);

    }
}
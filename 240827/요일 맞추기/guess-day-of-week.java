import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt(); 
        int m2 = sc.nextInt(); 
        int d2 = sc.nextInt(); 

        int[] days_of_month = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = new String[]{"","Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int day_num = 2; // 월요일
        
        if (m1 < m2 || (m1 == m2 && d1 <= d2)) {
                    while(true) {

            if (m1 == m2 && d1 == d2) break;

            // 날짜랑 요일번호 하나씩 증가
            d1 ++;
            day_num ++;

            // 일요일이 지났을 경우 월요일 번호로 교체
            if (day_num == 8) {day_num = 1;}
            
            // 다음달이 되었을 경우 교체해주기
            if (days_of_month[m1] < d1) {
                m1 ++;
                d1 = 1;
            }
        }
            
        }

        else {
        while(true) {

            if (m1 == m2 && d1 == d2) break;

            // 날짜랑 요일번호 하나씩 감소
            d1 --;
            day_num --;

            // 일요일 전일 경우 토요일 번호로 교체
            if (day_num == 0) {day_num = 7;}
            
            // 이전달이 되었을 경우 교체해주기
            if (d1 == 0) {
                m1 --;
                d1 = days_of_month[m1];
            }
        }
        }
        
        

        System.out.print(day[day_num]);

    }
}
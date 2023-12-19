import java.util.Scanner;

class Code {
    String secretCode, place, time;

    public Code(String secretCode, String place, String time) {
        this.secretCode = secretCode;
        this.place = place;
        this.time = time;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String place = sc.next();
        String time = sc.next();

        Code thisCode = new Code(secretCode, place, time);
        System.out.println("secret code : "+ thisCode.secretCode);        
        System.out.println("meeting point : " + thisCode.place); 
        System.out.println("time : " + thisCode.time); 
    }
}
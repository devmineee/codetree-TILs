import java.util.Scanner;
class Code {
    String code;
    char color;
    int second;

    public Code(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();
        Code thisCode = new Code(code, color, second);
        System.out.println("code : " + thisCode.code);
        System.out.println("color : " + thisCode.color);
        System.out.println("second : " + thisCode.second);
    }
}
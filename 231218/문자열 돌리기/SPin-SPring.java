import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int L = str.length();
        System.out.println(str);
        // L회 반복문
        for (int i=0; i<L; i++) {
            str = str.substring(L-1) + str.substring(0,L-1);
            System.out.println(str);
        }        
    }
}
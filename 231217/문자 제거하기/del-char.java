import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for (int i=0; i<len-1; i++) {
            int num = sc.nextInt();
            
            if (num >= str.length()) {
                num = str.length()-1;
            }
            
            str = str.substring(0,num) + str.substring(num+1);
            System.out.println(str);
            
        }   
    }
}
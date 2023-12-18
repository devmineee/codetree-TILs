import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();
        int req;
        for (int i=0; i<q; i++) {
            req = sc.nextInt();
            
            if (req == 1) {
                str = str.substring(1) + str.substring(0,1);
                System.out.println(str);
            }

            else if (req == 2) {
                str = str.substring(len-1) + str.substring(0,len-1);
                System.out.println(str);
            }

            else if (req == 3) {
                String temp = "";
                for (int j=len-1; j>=0; j--) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }

            


        }        
    }
            
}
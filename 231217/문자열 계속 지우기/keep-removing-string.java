import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strMain = sc.next();
        String str = sc.next();

        while (strMain.contains(str)) {

            for (int i=0; i<=strMain.length()-str.length(); i++) {

                if (strMain.substring(i,i+str.length()).equals(str)) {
                    strMain = strMain.substring(0,i) + strMain.substring(i+str.length());
                    break;
                }
            }  

        }
        System.out.print(strMain);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        char[] arr = new char[len];
        boolean isChanged = false;
        for (int i=0; i<len; i++) {
            if (isChanged == false && input.charAt(i) == '0') {
                arr[i] = '1';
                isChanged = true;
                continue;
            }
            arr[i] = input.charAt(i);
        }

        int t = 1;
        int sum = 0;
        for (int i = len-1; i>-1; i--) {
            sum += Character.getNumericValue(arr[i])*t;
            t*=2;
        }

        if (isChanged == false) sum --;


        System.out.print(sum);
        
    }
}
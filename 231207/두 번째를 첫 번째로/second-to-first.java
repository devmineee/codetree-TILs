import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == str.charAt(1)) {
                arr[i] = str.charAt(0);
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}
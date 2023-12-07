import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char first = str.charAt(0);
        char second = str.charAt(1);
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == first) {
                arr[i] = second;
            }
            else if (arr[i] == second) {
                arr[i] = first;
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}
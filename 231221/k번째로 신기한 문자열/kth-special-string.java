import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            String temp = sc.next();
            if (temp.contains(T)) {
                arr[i] = temp;
            }
            else {
                arr[i] = "{}{}";
            }
        }
            Arrays.sort(arr);
            System.out.print(arr[k-1]);

    }
}
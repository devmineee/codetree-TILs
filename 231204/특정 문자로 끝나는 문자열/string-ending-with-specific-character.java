import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i=0; i<10; i++) {
            arr[i] = sc.next();
        }
        char alphabet = sc.next().charAt(0);
        int cnt = 0;
        for (int i=0; i<10; i++) {
            int length = arr[i].length();
            if ( alphabet == arr[i].charAt(length-1)) {
                System.out.println(arr[i]);
                cnt ++;
            }
        }
        if (cnt == 0) {
            System.out.print("None");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        String sumString = Integer.toString(sum);
        int cnt = 0;
        for (int i=0; i<sumString.length(); i++) {
            if (sumString.charAt(i) == '1') {
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}
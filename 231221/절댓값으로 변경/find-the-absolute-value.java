import java.util.Scanner;
class IntWrapper {
    int value;
    
    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            IntWrapper a = new IntWrapper(arr[i]);
            if (a.value < 0) {
                arr[i] = a.value * (-1);
            }
            System.out.print(arr[i]+" ");
        }
    }
}
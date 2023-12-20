import java.util.Scanner;

class Save {
    int a, b;

    public Save(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Save save1 = new Save(n,m);
        n = save1.b;
        m = save1.a;

        System.out.print(n+" "+m);
    }
}
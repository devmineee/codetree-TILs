import java.util.Scanner;

class SaveFunc {
    int num1, num2;

    public SaveFunc(int numA, int numB) {
        if (numA > numB) {
            this.num1 = numA + 25;
            this.num2 = numB * 2;
        }

        else if (numA < numB) {
            this.num1 = numA * 2;
            this.num2 = numB + 25;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SaveFunc asdf = new SaveFunc(a,b);
        a = asdf.num1;
        b = asdf.num2;

        System.out.print(a+" "+b);

    }
}
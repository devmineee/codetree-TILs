import java.util.Scanner;

public class Main {

static int abs(int a, int b) {
    if (a-b < 0) {
        return b-a;
    }
    else return a-b;
}




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);




        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

int minVal = 1000000000;


        for (int i=0; i<n; i++) {
            int sumVal = 0; // 이동거리 변수

            for (int j=0; j<n; j++) {
                if (i==j) {continue;}
                sumVal += arr[j]* abs(i,j);
            }

            if (sumVal < minVal) {
                minVal = sumVal;
            }

        }

        System.out.print(minVal);



    }
}
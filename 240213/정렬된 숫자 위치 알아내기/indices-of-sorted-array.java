import java.util.Arrays;
import java.util.Scanner;
class Number implements Comparable<Number> {

    int num;
    int idx;

    public Number(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }


    @Override
    public int compareTo(Number number) {
        // 같은 숫자인 경우 인덱스가 낮은 쪽이 리턴 값이 더 낮아야 함
        if (this.num == number.num) {
            return this.idx - number.idx;
        }
        else {
            return this.num - number.num;
        }
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Number[] numbers = new Number[N];
        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            numbers[i] = new Number(num, i);
        }
        // 정렬
        Arrays.sort(numbers);
        
        int[] ints = new int[N];
        for (int i=0; i<N; i++) {
            ints[numbers[i].idx] = i+1;
        }
        for (int i=0; i<N; i++) {
            System.out.print(ints[i] + " ");
        }

    }
}
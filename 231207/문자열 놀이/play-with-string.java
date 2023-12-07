import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열 s
        String s = sc.next();
        // 질의의 개수 q
        int q = sc.nextInt();

        // 문자 수정할 배열 생성
        char[] arr = s.toCharArray();
        
        // q 번 반복해서 질의 받기
        for (int i=0; i<q; i++) {

            // 케이스 번호 받기
            int num = sc.nextInt();

            if (num == 1) {
                int numA = sc.nextInt();
                int numB = sc.nextInt();
                char A = arr[numA-1];
                char B = arr[numB-1];
                arr[numA-1] = B;
                arr[numB-1] = A;
            }

            else if (num == 2) {
                String charA = sc.next();
                String charB = sc.next();

                for (int j=0; j<arr.length; j++) {
                    if (arr[j]==charA.charAt(0)) {
                        arr[j] = charB.charAt(0);
                    }
                }
            }

            String result = String.valueOf(arr);
            System.out.println(result);
        }
    }
}
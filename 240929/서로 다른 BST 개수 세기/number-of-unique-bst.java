import java.util.Scanner;

public class Main {

    public static int[] right = new int[20];
    public static int[] temp = new int[20];

    public static void BST(int num, int currentNum) {

   

        if (currentNum == 1) {
            right[0] = 1;
        }

        else {
            for (int i=0; i<currentNum; i++) {

                int value = right[i];

                for (int j=0; j<=i+1; j++) {
                    if (i == j) continue;
                    temp[j] += value;
                }
            }

            for (int i=0; i<=currentNum; i++) {
                right[i] += temp[i];
                temp[i] = 0;
            }

            
        }

        if (currentNum == num) return;

        BST(num, currentNum+1);


    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BST(N, 1);
        int ans = 0;
        for (int i=0; i< 20; i++) {
            ans += right[i];
        }
        System.out.println(ans);

    }
}

// 어느 곳이든 가장 오른쪽에 있는 노드에 우측자식으로 붙을 수 있음 
// 어느 곳이든 가장 부모 노드의 부모로 붙을 수 있음


// 우측자식으로 붙으면 그건 그 다음에 그 노드 또 뗄수있음
// 부모는 그렇게 못씀


// 최상위를 기준으로
// 좌측만 있는 노드 a개
// 우측인 노드는 우측 몇개까지 있는지 계산
// 우측인 노드의 개수?
// right[] = ?

// n=2 일때
// right[0] = 1
// right[1] = 1

// n=3 일떄
// right[0] 인 친구는  right[1] 증가, right[0] 증가
// right[1] 인 친구는 right[2] 증가, right[0] 증가, right[1] 증가

// n=3 이면
// right[0] 인 친구는 그 개수만큼 right[1], right[0] 증가
// right[1] 인 친구는 그 개수만큼
import java.util.Scanner;

public class Main {

    public static int[][] arr = new int[4][4];
    public static int[][] temp = new int[4][4];


    public static void try2048(char dir) {

        if (dir == 'L') {
            for (int i=0; i<4; i++) {

                int startIdx = 0;
                int endIdx = startIdx+1;
                int tempIdx = 0;
                
                while (true) {

                    if (startIdx > 3) break;

                    if (endIdx > 3) { // 마지막 인덱스까지 탐색한 경우
                        temp[i][tempIdx] = arr[i][startIdx];
                        break;
                    }

                    if (arr[i][startIdx] == 0) { // 시작 인덱스가 비어있다면?

                        startIdx ++; // 다음 인덱스부터 보기
                        endIdx = startIdx + 1;

                    }

                    else if (arr[i][endIdx] == 0) { // 시작은 존재하지만 끝 인덱스가 비어있다면?
                        endIdx ++;
                    }

                    else if (arr[i][startIdx] != arr[i][endIdx]) {// 처음 만나는 존재하는 숫자가 같은 숫자가 아니라면?
                        temp[i][tempIdx] = arr[i][startIdx]; // 시작인덱스 숫자 그대로 기록
                        startIdx = endIdx;  // 끝인덱스부터 다시 탐색
                        endIdx = startIdx + 1;
                        tempIdx ++;
                    }

                    else if (arr[i][startIdx] == arr[i][endIdx]) {

                        temp[i][tempIdx] = arr[i][startIdx]*2; // 합쳐졌으니 두배
                        tempIdx ++; // temp 배열 다음 인덱스부터 기록
                        startIdx = endIdx + 1; // 끝 인덱스 다음 인덱스부터 탐색
                        endIdx = startIdx + 1;
                    }
                }
                
            }
        }

        else if (dir == 'R') {
              for (int i=0; i<4; i++) {

                int startIdx = 3;
                int endIdx = startIdx-1;
                int tempIdx = 3;
                
                while (true) {

                    if (startIdx < 0) break;

                    if (endIdx < 0) { // 마지막 인덱스까지 탐색한 경우
                        temp[i][tempIdx] = arr[i][startIdx];
                        break;
                    }

                    if (arr[i][startIdx] == 0) { // 시작 인덱스가 비어있다면?

                        startIdx --; // 다음 인덱스부터 보기
                        endIdx = startIdx - 1;

                    }

                    else if (arr[i][endIdx] == 0) { // 시작은 존재하지만 끝 인덱스가 비어있다면?
                        endIdx --;
                    }

                    else if (arr[i][startIdx] != arr[i][endIdx]) {// 처음 만나는 존재하는 숫자가 같은 숫자가 아니라면?
                        temp[i][tempIdx] = arr[i][startIdx]; // 시작인덱스 숫자 그대로 기록
                        startIdx = endIdx;  // 끝인덱스부터 다시 탐색
                        endIdx = startIdx - 1;
                        tempIdx --;
                    }

                    else if (arr[i][startIdx] == arr[i][endIdx]) {

                        temp[i][tempIdx] = arr[i][startIdx]*2; // 합쳐졌으니 두배
                        tempIdx --; // temp 배열 다음 인덱스부터 기록
                        startIdx = endIdx - 1; // 끝 인덱스 다음 인덱스부터 탐색
                        endIdx = startIdx - 1;
                    }
                }
                
            }

        }

        else if (dir == 'U') {
  for (int j=0; j<4; j++) {

                int startIdx = 0;
                int endIdx = startIdx+1;
                int tempIdx = 0;
                
                while (true) {

                    if (startIdx > 3) break;

                    if (endIdx > 3) { // 마지막 인덱스까지 탐색한 경우
                        temp[tempIdx][j] = arr[startIdx][j];
                        break;
                    }

                    if (arr[startIdx][j] == 0) { // 시작 인덱스가 비어있다면?

                        startIdx ++; // 다음 인덱스부터 보기
                        endIdx = startIdx + 1;

                    }

                    else if (arr[endIdx][j] == 0) { // 시작은 존재하지만 끝 인덱스가 비어있다면?
                        endIdx ++;
                    }

                    else if (arr[startIdx][j] != arr[endIdx][j]) {// 처음 만나는 존재하는 숫자가 같은 숫자가 아니라면?
                        temp[tempIdx][j] = arr[startIdx][j]; // 시작인덱스 숫자 그대로 기록
                        startIdx = endIdx;  // 끝인덱스부터 다시 탐색
                        endIdx = startIdx + 1;
                        tempIdx ++;
                    }

                    else if (arr[startIdx][j] == arr[endIdx][j]) {

                        temp[tempIdx][j] = arr[startIdx][j]*2; // 합쳐졌으니 두배
                        tempIdx ++; // temp 배열 다음 인덱스부터 기록
                        startIdx = endIdx + 1; // 끝 인덱스 다음 인덱스부터 탐색
                        endIdx = startIdx + 1;
                    }
                }
                
            }
        }

        else if (dir == 'D') {
 for (int j=0; j<4; j++) {

                int startIdx = 3;
                int endIdx = startIdx-1;
                int tempIdx = 3;
                
                while (true) {

                    if (startIdx < 0) break;

                    if (endIdx < 0) { // 마지막 인덱스까지 탐색한 경우
                        temp[tempIdx][j] = arr[startIdx][j];
                        break;
                    }

                    if (arr[startIdx][j] == 0) { // 시작 인덱스가 비어있다면?

                        startIdx --; // 다음 인덱스부터 보기
                        endIdx = startIdx - 1;

                    }

                    else if (arr[endIdx][j] == 0) { // 시작은 존재하지만 끝 인덱스가 비어있다면?
                        endIdx --;
                    }

                    else if (arr[startIdx][j] != arr[endIdx][j]) {// 처음 만나는 존재하는 숫자가 같은 숫자가 아니라면?
                        temp[tempIdx][j] = arr[startIdx][j]; // 시작인덱스 숫자 그대로 기록
                        startIdx = endIdx;  // 끝인덱스부터 다시 탐색
                        endIdx = startIdx - 1;
                        tempIdx --;
                    }

                    else if (arr[startIdx][j] == arr[endIdx][j]) {

                        temp[tempIdx][j] = arr[startIdx][j]*2; // 합쳐졌으니 두배
                        tempIdx --; // temp 배열 다음 인덱스부터 기록
                        startIdx = endIdx - 1; // 끝 인덱스 다음 인덱스부터 탐색
                        endIdx = startIdx - 1;
                    }
                }
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        char dir = sc.next().charAt(0);

       try2048(dir);
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(temp[i][j] + " ");
            }

                System.out.println();
        }

    }
}
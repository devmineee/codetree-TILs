import java.util.Scanner;
import java.util.Arrays;
class Info{
    char code;
    int score;

    public Info(char code, int score) {
        this.code = code;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] infos = new Info[5];
        for (int i=0; i<5; i++) {
            char code = sc.next().charAt(0);
            int score = sc.nextInt();
            infos[i] = new Info(code, score);
            
        }

        char lowCode = 'z';
        int lowScore = 100;
        for (int i=0; i<5; i++) {
            if (infos[i].score < lowScore) {
                lowCode = infos[i].code;
                lowScore = infos[i].score;
            }
        }
        System.out.print(lowCode+" "+lowScore);
    }
}
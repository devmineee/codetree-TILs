import java.util.Scanner;

class UserInfo{
    String userName;
    int level;

    public UserInfo() {
        this.userName = "codetree";
        this.level = 10;
    }

    public UserInfo(String userName, int level) {
        this.userName = userName;
        this.level = level;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        int level = sc.nextInt();

        UserInfo userInfo1 = new UserInfo();
        UserInfo userInfo2 = new UserInfo(userName, level);

        System.out.println("user "+ userInfo1.userName + " lv " + userInfo1.level);
        System.out.println("user "+ userInfo2.userName + " lv " + userInfo2.level);
    }
}
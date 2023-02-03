import java.util.Scanner;

// 1094번 막대기
public class test1 {
    public static void main(String[] args) {
        int stick = 64;
        int x = new Scanner(System.in).nextInt();
        int cnt = 0;

        while (x > 0 && x < 64) {
            if (stick > x)
                stick /= 2;
            else {
                x -= stick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

import java.util.Scanner;

// 1568번 새
public class test7 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int cnt = 0;
        int K = 1;

        while(N > 0) {
            if (N >= K) {
                N -= K;
                K++;
                cnt++;
            }
            else
                K = 1;
        }
        System.out.println(cnt);
    }
}

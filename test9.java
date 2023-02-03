import java.util.Scanner;

//1834번 나머지와 몫이 같은 수
public class test9 {
    public static void main(String[] args) {
        long N = new Scanner(System.in).nextLong();
        long sum = 0;

        for(long i=1; i<N; i++) {
            sum += (N+1) *i;
        }

        System.out.println(sum);
    }
}

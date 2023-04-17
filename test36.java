import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test36 {
    public static void main(String[] args) throws IOException {
        //3004번 체스판 조각
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int chess = 2;

        for(int i=2; i<=N; i++) {
            chess += ((i/2) + 1) ;
        }
        System.out.println(chess);
    }
}

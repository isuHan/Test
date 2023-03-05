import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num;
        int sum = 0;

        //차례대로 쪼개놓은 문자열을 숫자로 변환한 후, 제곱하여 더한다.
        for(int i=0; i<5; i++) {
            num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }

        System.out.println(sum % 10);
        br.close();
    }
}

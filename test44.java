import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test44 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        while(true) {
            int num = Integer.parseInt(br.readLine().trim());

            if(num == 0) break;

            if(num % n == 0) {
                System.out.println(num + " is a multiple of " + n + ".");
            } else {
                System.out.println(num + " is NOT a multiple of " + n + ".");
            }
        }

        br.close();
    }
}

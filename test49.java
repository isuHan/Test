import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test49 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[31];

        for(int i=1; i<29; i++) {
            int n = Integer.parseInt(br.readLine());
            num[n] = 1;
        }

        for(int i=1; i<num.length; i++) {
            if(num[i] != 1)
                System.out.println(i);
        }

        br.close();
    }
}

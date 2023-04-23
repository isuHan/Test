import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test38 {
    public static void main(String[] args) throws IOException {
        //3046번 R2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");


        int R1 = Integer.parseInt(str[0]);
        int S =  Integer.parseInt(str[1]);

        int R2 = (2 * S) - R1;
        System.out.println(R2);
    }
}

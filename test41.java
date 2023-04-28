import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String str = br.readLine();
            System.out.println((str.charAt(0) + "").toUpperCase() + str.substring(1, str.length()));
        }
        br.close();
    }
}

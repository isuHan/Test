import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test25 {
    public static void main(String[] args) throws IOException {
        //2743번 단어 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.length());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            String[] strArr = str.split("");

            if(strArr[i].equals(strArr[i].toUpperCase())) {
                System.out.print(strArr[i].toLowerCase());
            } else {
                System.out.print(strArr[i].toUpperCase());
            }
        }
        br.close();
    }
}

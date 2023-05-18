import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test52 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();

            if(str.equals("*")) break;

            Boolean[] alphabets = new Boolean[26];
            Boolean isPangram = true;

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);

                if(c >= 'a' && c <= 'z')
                    alphabets[c - 'a'] = true;
            }
            for (Boolean alphabet : alphabets) {
                if(!alphabet)
                    isPangram = false;
                break;
            }
            System.out.println(isPangram ? "Y" : "N");
        }
        br.close();
    }
}

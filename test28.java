import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test28 {
    public static void main(String[] args) throws IOException {
        //2789번 유학 금지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = "CAMBRIDGE".toCharArray();

        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(arr[i]) > -1) {
                str = str.replaceAll(String.valueOf(arr[i]),"");
            }
        }
        System.out.println(str);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test17 {
    public static void main(String[] args) throws IOException {

        //2386번 도비의 영어공부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while(true) {
            String alpha = br.readLine();
            String[] arr = alpha.toLowerCase().split("");

            for(int i=1; i<arr.length; i++) {
                if(arr[0].equals(arr[i]))
                    count++;
            }
            if (alpha.equals("#"))
                break;

            System.out.println(count);
            count = 0;
        }
    }
}

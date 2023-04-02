import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test32 {
    public static void main(String[] args) throws IOException {
        //2875번 FBI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        //5번 반복
        for(int i=1; i<6; i++) {
            //FBI 문자열이 들어있다면
            if(br.readLine().contains("FBI"))
                //str 에  i를 더한다
                str += i + " ";
        }
        //삼항연산자 이용
        System.out.println(str !="" ? str.trim(): "HE GOT AWAY!");
    }
}

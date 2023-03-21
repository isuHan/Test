import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test24 {
    public static void main(String[] args) throws IOException {
        //2739번 구구단
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력된 문자열을 숫자로 변환해서 담기
        int input = Integer.parseInt(br.readLine());
        //구구단 출력
        for(int i=1; i<=9; i++) {
            System.out.println(input + "*" + i + "=" + (input * i));
        }

        br.close();
    }
}

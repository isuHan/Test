import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test26 {
    public static void main(String[] args) throws IOException {
        //2744번 대소문자 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열로 입력 받기
        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            //문자열을 배열로 바꾸기
            String[] strArr = str.split("");

            //배열요소 대소문자 구분 후, 반대로 출력하기
            if(strArr[i].equals(strArr[i].toUpperCase())) {
                System.out.print(strArr[i].toLowerCase());
            } else {
                System.out.print(strArr[i].toUpperCase());
            }
        }
        br.close();
    }
}

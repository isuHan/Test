import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //점수 계산
        double grade = 0;

        //학점 첫번째 알파벳 분리
        char c = s.charAt(0);
        //학점 첫번째 계산
        if (c == 'A') {
            grade = 4;
        } else if (c == 'B') {
            grade = 3;
        } else if (c == 'C') {
            grade = 2;
        } else if (c == 'D') {
            grade = 1;
        } else {
            System.out.print("0.0");
            return;
        }

        //학점 2번째 알파벳 분리
        c = s.charAt(1);
        //학점 2번째 계산
        if (c == '+') {
            grade += 0.3;
        } else if (c == '-') {
            grade -= 0.3;
        }

        //출력
        System.out.print(grade);
    }
}

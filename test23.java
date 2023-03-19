import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test23 {
    public static void main(String[] args) throws IOException {

        //2576번 홀수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 0;
        int oddNum = 0;

        //한 문단씩 읽는 readline()으로 분리할 필요 없이 하나씩 숫자로 변환해 받는다
        for(int i=0; i<7; i++) {
            int arr = Integer.parseInt(br.readLine());

            //홀수일 경우
            if(arr % 2 == 1){
                //홀수의 합 구하기
                oddNum += arr;

                //최대값 구하기
                if(min < arr)
                    min = arr;
            }
        }

        //홀수가 하나도 없는 경우 = 홀수의 합이 0
        if(oddNum == 0) {
            System.out.println("-1");
            return;
        }

        System.out.println("oddNum");
        System.out.println("min");
    }
}

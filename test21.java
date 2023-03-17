import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int order = 0;
        int[] arr = new int[9];

        //배열에 요소를 차례대로 넣고 숫자로 바꾸기
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //요소의 최대값 및 최대값의 인덱스 구하기
        for(int i=0; i<9; i++) {
            //최대값일 경우
            if(max < arr[i]) {
                max = arr[i];
                order = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(order);
    }
}

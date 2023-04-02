import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test31 {
    public static void main(String[] args) throws IOException {
        //2846번 오르막길
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력횟수 N에 저장
        int N = Integer.parseInt(br.readLine());
        //길이 스트링배열에 저장
        String[] str = br.readLine().split(" ");

        //스트링배열을 숫자배열로 바꾸기
        int[] arr = new int[str.length];
        for(int i=0; i< arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int longInterval = 0;
        int interval = 0;
        //오르막길 구하기
        for(int i=0; i<N-1; i++) {
            if(arr[i] < arr[i+1]) { //오르막길이라면 interval 구하기
                interval += arr[i+1] - arr[i];
            } else { //아니라면 interval 은 0
                interval = 0;
            }
            if(longInterval < interval) //최대 interval 구하기
                longInterval = interval;
        }
        System.out.println(longInterval);
    }
}

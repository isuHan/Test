import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test29 {
    public static void main(String[] args) throws IOException {
        //2798번 블랙잭
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첫 번째 입력줄 배열생성
        String strArr1[] = br.readLine().split(" ");
        //두 번째 입력줄 배열생성
        String strArr2[] = br.readLine().split(" ");

        //첫 번째 배열 N과 M으로 분리해서 숫자로 변환
        int N = Integer.parseInt(strArr1[0]);
        int M = Integer.parseInt(strArr1[1]);

        //두 번째 배열을 숫자로 변환
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(strArr2[i]);
        }

        //계산 메서드 출력
        System.out.println(search(arr, N, M));
    }

    //계산 메서드 생성
    static int search(int[] arr, int N, int M) {

        int result = 0;

        //첫번째 카드합
        for(int i=0; i< N-2; i++) {
            if(arr[i] > M)
                continue; //예외처리

            //두번째 카드합
            for(int j=i+1; j< N-1; j++) {
                if(arr[i] + arr[j] > M)
                    continue; //예외처리

                //세번째 카드 합
                for(int k=j+1; k< N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if(M == temp) //합이 M과 같을 경우
                        return temp;

                    if(temp < M && result < temp) //합이 M보다 작을 경우
                        result = temp;
                }
            }
        }
        return result;
    }
}



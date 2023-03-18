import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test22 {
    public static void main(String[] args) throws IOException {

        //2566번 최댓값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int 배열을 생성한다
        int[][] arr = new int[9][9];
        //String 배열을 생성한다
        for(int i=0; i<9; i++) {
            String[] strArr = br.readLine().split(" ");
            //String 배열을 int로 바꾸고 int 배열에 넣는다
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        int max = 0;
        int r = 0;
        int c = 0;
        //최대값을 구하고 행과 열 인덱스를 출력한다
        for(int i=0; i<9; i++) {
            for(int j=0; j<arr.length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    r = i+1;
                    c = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(r +" "+ c);
    }
}

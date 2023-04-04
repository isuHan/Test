import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        out: while (true) {
            int loop = 0; // 탈출변수

            for (int i = 0; i < arr.length - 1; i++) { // 루프시작
                int temp = 0;
                if (arr[i] > arr[i + 1]) { // 뒤의 수가 앞보다 클때, 순서변환
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    for (int j = 0; j < arr.length; j++) { // 변환상태 출력
                        System.out.print(arr[j]);
                        if (j != arr.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            for (int i = 0; i < arr.length - 1; i++) { // break 체크
                if (arr[i] < arr[i + 1]) {
                    ++loop;
                }
            }
            if (loop == arr.length - 1) // break조건 제로데이
                break out;
        }
    }
}

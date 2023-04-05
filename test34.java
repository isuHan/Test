import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] eval_scores = new int[5][4];
        int[] scores = new int[5];
        int max = 0;
        int num = 0;

        for(int i=0; i< 5; i++) {
            String[] str = br.readLine().split(" ");
            int sum = 0;

            for (int j = 0; j < str.length; j++) {
                eval_scores[i][j] = Integer.parseInt(str[j]);
                sum += eval_scores[i][j];
            }
            scores[i] = sum;

            if (max< scores[i]) {
                max = scores[i];
                num = i+1;
            }
        }
        System.out.println(num + " " + max);
    }
}
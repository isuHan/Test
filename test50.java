import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test50 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.parseInt(br.readLine());
        while(true) {
            String operator = br.readLine();
            if(operator.equals("+"))
                sum += Integer.parseInt(br.readLine());
            else if (operator.equals("-")) {
                sum -= Integer.parseInt(br.readLine());
            } else if (operator.equals("*")) {
                sum *= Integer.parseInt(br.readLine());
            } else if (operator.equals("/")) {
                sum /= Integer.parseInt(br.readLine());
            } else if (operator.equals("=")) {
                break;
            }
        }
        System.out.println(sum);
        br.close();
    }
}

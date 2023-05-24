import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test55 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;

        while (true) {
            String[] str = br.readLine().split(" ");
            int num[] = new int[3];
            for (int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(str[i]);
            }
            int a = num[0];
            int b = num[1];
            int c = num[2];

            if (a == 0) break;

            System.out.println("Triangle #" + cnt);

            if (a == -1) {
                double result = Math.sqrt(c * c - b * b);
                if (result > 0 && result <= 10000) {
                    System.out.printf("a = %.3f\n\n", result);
                } else {
                    System.out.println("Impossible.\n");
                }
            } else if (b == -1) {
                double result = Math.sqrt(c * c - a * a);
                if (result > 0 && result <= 10000) {
                    System.out.printf("b = %.3f\n\n", result);
                } else {
                    System.out.println("Impossible.\n");
                }
            } else if (c == -1) {
                double result = Math.sqrt(a * a + b * b);
                if (result > 0 && result <= 10000) {
                    System.out.printf("c = %.3f\n\n", result);
                } else {
                    System.out.println("Impossible.\n");
                }
            }

            cnt++;
        }

        br.close();
    }
}

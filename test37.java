import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test37 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int ZR = Integer.parseInt(input[2]);
        int ZC = Integer.parseInt(input[3]);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                for (int k = 0; k < ZC; k++) {
                    sb.append(line.charAt(j));
                }
            }
            sb.append("\n");
            for (int l = 1; l < ZR; l++) {
                sb.append(sb.substring(sb.length() - (C * ZC)) + "\n");
            }
        }

        System.out.println(sb.toString());
    }
}


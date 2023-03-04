import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");

            int yut = 0;
            for (int j = 0; j < arr.length; j++) {
                if (Integer.parseInt(arr[j]) == 0) {
                    yut++;
                }
            }
            String str = "";
            switch (yut) {
                case 0:
                    str = "E";
                    break;
                case 1:
                    str = "A";
                    break;
                case 2:
                    str = "B";
                    break;
                case 3:
                    str = "C";
                    break;
                default:
                    str = "D";
                    break;
            }
            System.out.println(str);
        }

    }
}

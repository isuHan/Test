import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test47 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            int store = Integer.parseInt(br.readLine());
            String[] street = br.readLine().split(" ");
            int[] streets = new int[store];

            for(int j=0; j<store; j++) {
                streets[j] = Integer.parseInt(street[j]);
            }
            Arrays.sort(streets);
            System.out.println((streets[store-1] - streets[0])*2);
        }
        br.close();
    }
}

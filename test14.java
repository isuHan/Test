import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int money = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nun1 = Integer.parseInt(st.nextToken());
            int nun2 = Integer.parseInt(st.nextToken());
            int nun3 = Integer.parseInt(st.nextToken());

            if(nun1 == nun2 && nun2 == nun3) {
                money = 10000 +  nun1 * 1000;
            } else if (nun1 != nun2 && nun2 != nun3 && nun3 != nun1) {
                money = Math.max(nun1, Math.max(nun2, nun3)) * 100;
            } else {
                if(nun1 == nun2)
                    money = 1000 + nun1 * 100;
                else if (nun2 == nun3)
                    money = 1000 + nun2 * 100;
                else
                    money = 1000 + nun3 * 100;
            }

            if(max < money)
                max = money;
        }
        System.out.println(max);
    }
}

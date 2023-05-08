import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test48 {
    public static void main(String[] args) throws IOException {
        //5063번 TNG
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(r> e-c)
                System.out.println("do not advertise");
            else if (r == e-c )
                System.out.println("does not matter");
            else
                System.out.println("advertise");
        }

    }
}

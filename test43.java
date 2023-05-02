import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int Player1 = 0;
            int Player2 = 0;

            for(int j=0; j<n; j++) {
                String[] str = br.readLine().split(" ");

                if(str[0].equals("R") && str[1].equals("S") ||
                        str[0].equals("S") && str[1].equals("P") ||
                        str[0].equals("P") && str[1].equals("R")) {
                    Player1++;
                } else if (!str[0].equals(str[1])) {
                    Player2++;
                } else {
                }
            }

            if(Player1 > Player2) {
                System.out.println("Player1");
            } else if ( Player1 < Player2) {
                System.out.println("Player2");
            } else {
                System.out.println("TIE");
            }
        }
        br.close();
    }
}

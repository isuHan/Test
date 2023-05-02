import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test45 {
    public static void main(String[] args) throws IOException {
        //4880번 다음수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] str = br.readLine().split(" ");
            int[] num = new int[3];

            for(int i=0; i<3; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            if(num[2] == 0 && num[1] == 0 && num[0] == 0)
                break;

            if(num[1]-num[0] == num[2]-num[1])
                System.out.println("AP " + (num[2]+(num[1]-num[0])));
            else if ((num[1]/num[0] == num[2]/num[1]))
                System.out.println("GP " + (num[2]*(num[1]/num[0])));
        }
        br.close();
    }
}

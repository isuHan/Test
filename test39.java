import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class test39 {
    public static void main(String[] args) throws IOException {
        //3047번 ABC
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        String order = br.readLine();

        int[] sorted = new int[3];
        sorted[0] = Integer.parseInt(nums[0]);
        sorted[1] = Integer.parseInt(nums[1]);
        sorted[2] = Integer.parseInt(nums[2]);
        Arrays.sort(sorted);

        for(int i=0; i<3; i++) {
            if(order.charAt(i) == 'A') {
                System.out.print(sorted[0] + " ");
            } else if (order.charAt(i) == 'B') {
                System.out.print(sorted[1] + " ");
            } else {
                System.out.print(sorted[2] + " ");
            }
        }
        br.close();
    }
}

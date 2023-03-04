import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("-", 0);
        map.put("\\", 1);
        map.put("(", 2);
        map.put("@", 3);
        map.put("?", 4);
        map.put(" ", 5);
        map.put("&", 6);
        map.put("&", 7);
        map.put("/", -1);

        while(true) {
            String st = sc.nextLine();
            if (st.equals("#")) break;

            String[] str = st.split("");

            int sum = 0, num = 0;

            for(int i=0; i< str.length; i++) {
                sum += map.get(str[i]) * Math.pow(8, str.length - 1 - i);
            }
            System.out.println(sum);
        }
    }
}

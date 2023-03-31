import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class test30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //TreeMap에 점수(=키)와 문제번호(=값)를 저장
        TreeMap<Integer, String> map = new TreeMap<>();
        for(int i=0; i<8; i++) {
            map.put(Integer.parseInt(br.readLine()), (i+1) + "");
        }


        //점수(=키)를 내림차순으로 정렬해서, 5번쨰까지 배열에 저장한다
        int sum = 0;
        String[] str = new String[5];
        int w = 0;
        for(Integer key : map.descendingMap().keySet()) {
            //sum에 배열의 총합을 저장한다.
            sum += key;
            //key에 해당하는 value를 배열에 저장한다
            str[w] = map.get(key);

            if(w == 4) break;

            w++;
        }

        //sum 출력
        Arrays.sort(str);
        System.out.println(sum);

        //value 출력
        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);
            if(i != str.length-1)
                System.out.println("");
        }
    }
}

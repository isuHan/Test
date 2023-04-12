import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test35 {
    public static void main(String[] args) throws IOException {
        //2966번 찍기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String answer = br.readLine();

        String[] sang = new String[num];
        String[] chang = new String[num];
        String[] hyun = new String[num];

        for(int i=0; i<num; i++) {
            sang[i] = (i % 3 == 0) ? "A" : (i % 3 == 1) ? "B" : "C";
            chang[i] = (i % 4 == 0 || i % 4 == 1) ? "B" : "A";
            hyun[i] = (i % 6 < 2) ? "C" : (i % 6 < 4) ? "A" : "B";
        }

        int sangScore = getScore(answer, sang);
        int changScore = getScore(answer, chang);
        int hyunScore = getScore(answer, hyun);

        if (sangScore > changScore && sangScore > hyunScore) {
            System.out.println("Adrian");
        } else if (changScore > sangScore && changScore > hyunScore) {
            System.out.println("Bruno");
        } else {
            System.out.println("Goran");
        }
    }

    public static int getScore(String answer, String[] ans) {
        int score = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i].equals(answer.charAt(i) + "")) {
                score++;
            }
        }
        return score;
    }
}

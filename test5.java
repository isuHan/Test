import java.util.Scanner;

// 1371번 가장 많은 글자
public class test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alphabet = new int[26];
        int max = 0;

        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }

        for(int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}

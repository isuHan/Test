import java.util.Scanner;

//1264번 모음의 개수
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while(true){
            String str = sc.nextLine();
            if(str.equals("#")) break;

            String[] sentence = str.toLowerCase().split("");

            String[] word = {"a","e", "i", "o", "u"};

            for(int i=0; i< sentence.length; i++) {
                for(int j=0; j < 5; j++) {
                    if(sentence[i].equals(word[j]))
                        cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}

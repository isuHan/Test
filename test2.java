import java.util.Scanner;
import java.util.StringTokenizer;

//1152번 단어의 개수
public class test2 {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new Scanner(System.in).nextLine(), " ").countTokens());
    }
}
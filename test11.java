import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int star = new Scanner(System.in).nextInt();

        for(int i=0; i< star; i++) {
            for(int j=0; j< i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

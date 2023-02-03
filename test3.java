import java.util.Scanner;

//1259번 팰린드롬수
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();
            if (str.equals("0"))
                break;

            String[] arr = str.split("");
            boolean loop = true;

            for(int i=0; i<(arr.length) / 2; i++) {
                if(!arr[i].equals(arr[arr.length -1 - i])) {
                    loop = false;
                    break;
                }
            }

            if(loop)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}

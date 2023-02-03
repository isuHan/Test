import java.util.Scanner;

//1731번 추론
public class test8 {
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        if(arr[1] / arr[0] == arr[2] / arr[1])
            System.out.println(arr[num-1] * (arr[1] / arr[0]));
        else if(arr[1] - arr[0] == arr[2] - arr[1])
            System.out.println(arr[num-1] + (arr[1] - arr[0]));

    }
}

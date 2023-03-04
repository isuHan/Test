import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int[] output = new int[7];
        int sum = 0;

        while(true) {
            int num = sc.nextInt();
            for(int i=0; i<9; i++) {
                height[i] = num;

            }

            for(int i=0; i<7; i++) {
                sum += height[i];

                if(sum == 100)
                    for(int j=0; j<7; j++)
                        output[j] = height[i];
                    break;
            }
        }

    }
}

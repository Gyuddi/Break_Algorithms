import java.util.Scanner;

public class BOJ_5597_H {
    public static void main(String[] args) {
        boolean[] arr = new boolean[31];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            arr[sc.nextInt()] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if (!arr[i])System.out.println(i);
        }
    }
}

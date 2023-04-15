import java.util.Scanner;

public class INF_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[100001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i*i < 100000; i++) {
            if (!arr[i]){
                for (int j = 2*i; j <= 100000; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (!arr[reverse(num)]) System.out.print(reverse(num)+ " ");
        }
    }
    private static int reverse(int num){
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}

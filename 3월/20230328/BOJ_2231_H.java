import java.util.Scanner;

public class BOJ_2231_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (decomp(i) == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
    private static int decomp(int N){
        int sum = N;
        while (N > 0){
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }
}

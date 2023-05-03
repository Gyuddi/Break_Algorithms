import java.util.Scanner;

public class INF_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        int p1 = 0;
        int p2 = K;
        int answer = sum;
        while (p1<p2 && p2 < N){
            sum -= arr[p1];
            sum += arr[p2];
            if (sum > answer) answer = sum;
            p1++;
            p2++;
        }
        System.out.println(answer);
    }
}

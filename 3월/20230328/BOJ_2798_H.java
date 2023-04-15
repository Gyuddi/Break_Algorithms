import java.util.Scanner;

public class BOJ_2798_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int gap = M;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M && M-sum < gap) {
                        gap = M-sum;
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

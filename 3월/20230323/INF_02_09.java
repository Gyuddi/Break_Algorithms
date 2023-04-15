import java.util.Scanner;

public class INF_02_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
            if (sum > max) max = sum;
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[j][i];
            }
            if (sum > max) max = sum;
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i][i];
        }
        if (sum > max) max = sum;
        sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            sum += arr[i][N-1-i];
        }
        if (sum > max) max = sum;
        System.out.println(max);
    }
}

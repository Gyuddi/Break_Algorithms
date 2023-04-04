import java.util.Scanner;

public class INF_03_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        int p1 = 0;
        int answer = 0;
        while (p1 < N-1){
            int sum = 0;
            for (int i = p1; i < N; i++) {
                sum += arr[i];
                if (sum == N) {
                    answer ++;
                    break;
                }
                if (sum > N) break;
            }
            p1 ++;
        }
        System.out.println(answer);
    }
}

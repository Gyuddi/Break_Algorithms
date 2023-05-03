import java.util.Scanner;

public class INF_03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int p1 = 0;
        int answer = 0;
        while (p1 < N) {
            int count = 0;
            int zero = 0;
            for (int i = p1; i < N; i++) {
                if (arr[i] == 0) zero++;
                if (zero > k) break;
                count++;
            }
            if (count > answer) answer = count;
            p1++;
        }
        System.out.println(answer);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class INF_02_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] rank = new int[N];
        Arrays.fill(rank, 1);
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j] > arr[i]) rank[i]++;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}

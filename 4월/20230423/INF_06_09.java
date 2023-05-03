import java.util.Arrays;
import java.util.Scanner;

public class INF_06_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= M) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }
        System.out.println(answer);
    }

    private static int count(int[] arr, int capacity) {
        int sum = 0;
        int count = 0;
        for (int i : arr) {
            sum += i;
            if (sum > capacity){
                sum = i;
                count++;
            }
        }
        if (sum > 0) count++;
        return count;
    }
}

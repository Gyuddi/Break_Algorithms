import java.util.Arrays;
import java.util.Scanner;

public class INF_06_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        int lt = 1;
        int rt = arr[N-1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) < M) {
                rt = mid - 1;

            } else {
                lt = mid + 1;
                answer = mid;
            }
        }
        System.out.println(answer);
    }

    private static int count(int[] arr, int gap) {
        int start = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[start] >= gap){
                count++;
                start = i;
            }
        }
        return count;
    }
}
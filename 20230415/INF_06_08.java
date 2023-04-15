import java.util.Arrays;
import java.util.Scanner;

public class INF_06_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lp = 0;
        int rp = N-1;
        while (lp <= rp){
            int mid = (lp + rp)/2;
            if (arr[mid] == M) {
                System.out.println(mid+1);
                break;
            }
            if (arr[mid] > M){
                rp = mid -1;
            }
            else lp = mid +1;
        }
    }
}

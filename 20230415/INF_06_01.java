import java.util.ArrayList;
import java.util.Scanner;

public class INF_06_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int min = 101;
            int idx = -1;
            for (int j = i+1; j < N; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            if (arr[i] > arr[idx]){
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

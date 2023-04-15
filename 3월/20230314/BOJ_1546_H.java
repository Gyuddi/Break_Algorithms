import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1546_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double max = arr[arr.length-1];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i]/max*100;
        }
        System.out.println(sum/N);
    }
}

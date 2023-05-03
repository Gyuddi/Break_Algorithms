import java.util.Arrays;
import java.util.Scanner;

public class INF_06_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < N; i++) {
            if (tmp[i] != arr[i]){
                System.out.print(i+1 + " ");
            }
        }
    }
}

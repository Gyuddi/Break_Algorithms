import java.util.Arrays;
import java.util.Scanner;

public class INF_02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count[][] = new int[N][5];
        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[N];
            check[i] = true;
            for (int j = 0; j < 5; j++) {
                int tmp = arr[i][j];
                for (int k = 0; k < N; k++) {
                    if (!check[k]){
                        if (arr[k][j] == tmp) {
                            count[i][j]++;
                            check[k] = true;
                        }
                    }
                }
            }
        }
        int max = 0;
        int answer = 1;
        for (int i = 0; i < N; i++) {
            if (Arrays.stream(count[i]).sum() > max) {
                max = Arrays.stream(count[i]).sum();
                answer = i + 1;
            }
        }
        System.out.println(answer);
    }
}

import java.util.Scanner;

public class INF_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[200001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i*i < N; i++) {
            if (!arr[i]){
                for (int j = 2*i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (!arr[i]) answer ++;
        }
        System.out.println(answer);
    }
}

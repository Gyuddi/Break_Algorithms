import java.util.Scanner;

public class BOJ_1978_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] arr = new boolean[1001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i*i <= 1000; i++) {
            if (!arr[i]){
                for (int j = 2*i; j <= 1000; j+=i) {
                    arr[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (!arr[a]) count++;
        }
        System.out.println(count);
    }
}

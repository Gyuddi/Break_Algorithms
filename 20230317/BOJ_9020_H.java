import java.util.Scanner;

public class BOJ_9020_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[10001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i*i <= 10000; i++) {
            if (!arr[i]){
                for (int j = 2*i; j <= 10000; j+=i) {
                    arr[j] = true;
                }
            }
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            gold(a,arr);
        }
    }
    private static void gold(int a, boolean[] arr){
        int gap = 10000;
        int m = 0;
        int n = 0;
        for (int i = 2; i <= a/2; i++) {
            if (!arr[i]){
                if (!arr[a-i]){
                    if ((a-i) - i < gap){
                        m = i;
                        n = a-i;
                    }
                }
            }
        }
        System.out.println(m+" "+n);
    }
}

import java.util.Scanner;

public class BOJ_2839_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[5001];
        arr[3] = 1;
        arr[5] = 1;
        System.out.println(extracted(N, arr));
    }

    private static int extracted(int N, int[] arr) {
        for (int i = 6; i <= N; i++) {
            int tmp = Math.min(arr[i-3], arr[i-5]);
            if (tmp == 0){
                if (arr[i-3] == 0 && arr[i-5] != 0) {
                    tmp = arr[i-5];
                    arr[i] = tmp+1;
                }
                else if (arr[i-5] == 0 && arr[i-3] != 0) {
                    tmp = arr[i-3];
                    arr[i] = tmp+1;
                }
            }
            else arr[i] = tmp+1;
        }
        if (arr[N] == 0) return -1;
        else return arr[N];
    }
}

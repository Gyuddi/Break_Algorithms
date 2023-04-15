import java.util.Scanner;

public class INF_02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N+2][N+2];
        for (int i = 0; i < N+2; i++) {
            for (int j = 0; j < N+2; j++) {
                if (i == 0 || j == 0 || i == N+1 || j == N+1) arr[i][j] = 0;
                else arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                int max_H = Math.max(arr[i-1][j], arr[i+1][j]);
                int max_V = Math.max(arr[i][j-1], arr[i][j+1]);
                if (arr[i][j]>Math.max(max_H,max_V)) count++;
            }
        }
        System.out.println(count);
    }
}

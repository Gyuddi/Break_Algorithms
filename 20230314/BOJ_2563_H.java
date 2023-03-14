import java.util.Scanner;

public class BOJ_2563_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j < a+10; j++) {
                for (int k = b; k < b+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) answer++;
            }
        }
        System.out.println(answer);
    }
}

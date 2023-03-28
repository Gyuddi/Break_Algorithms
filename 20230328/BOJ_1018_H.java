import java.util.Scanner;

public class BOJ_1018_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean arr[][] = new boolean[N][M];
        boolean arrB[][] = new boolean[8][8];
        for (int i = 0; i < N; i++) {
            String[] tmp = sc.next().split("");
            for (int j = 0; j < tmp.length; j++) {
                arr[i][j] = tmp[j].equals("W");
            }
        }
        boolean tmp = true;
        for (int i = 0; i < 8; i++) {
            tmp = !tmp;
            for (int j = 0; j < 8; j++) {
                arrB[i][j] = tmp;
                tmp = !tmp;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int a = getExtract(i, j, arr, arrB);
                if (a < min) min = a;
            }
        }
        System.out.println(min);
    }

    private static int getExtract(int x, int y, boolean[][] arr, boolean[][] arrB) {
        int countB = 0;
        int countW = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != arrB[i - x][j - y]) countB++;
                else countW++;
            }
        }
        return Math.min(countB, countW);
    }
}

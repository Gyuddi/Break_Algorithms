import java.util.Scanner;

public class INF_02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = sc.nextInt()-1;
                arr[tmp][i] = j+1;
            }
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j){
                    if (isBigger(arr[i], arr[j])) answer++;
                }
            }
        }
        System.out.println(answer);
    }
    private static boolean isBigger(int[] arrA, int[] arrB){
        boolean answer = true;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] > arrB[i]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}

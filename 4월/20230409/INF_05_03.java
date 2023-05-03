import java.util.Scanner;
import java.util.Stack;

public class INF_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < M; i++) {
            int tmp = moves[i]-1;
            for (int j = 0; j < N; j++) {
                if (board[j][tmp] != 0){
                    if (stack.empty()) {
                        stack.push(board[j][tmp]);
                        board[j][tmp] = 0;
                        break;
                    }
                    if (board[j][tmp] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                        board[j][tmp] = 0;
                        break;
                    }
                    else {
                        stack.push(board[j][tmp]);
                        board[j][tmp] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

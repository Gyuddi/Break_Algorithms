import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_07_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.println(bfs(S, E));
    }

    private static int bfs(int S, int E) {
        boolean[] check = new boolean[10001];
        int answer = 10000;
        int count = 1;
        int[] dx = new int[]{-1, 1, 5};
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int a = tmp + dx[j];
                    if (a > 0 && a <= 10000 && !check[a]) {
                        queue.add(a);
                        check[a] = true;
                    }
                    if (a == E) {
                        if (answer > count) answer = count;
                    }
                }
            }
            count++;
        }
        return answer;
    }
}

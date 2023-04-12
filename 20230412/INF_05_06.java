import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K-1; j++) {
                queue.add(queue.poll());
            }
            if (i == N-1) {
                System.out.println(queue.poll());
                break;
            }
            queue.poll();
        }
    }
}

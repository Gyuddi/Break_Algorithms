import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(new int[]{i, sc.nextInt()});
        }
        int count = 0;
        while (true) {
            int[] tmp = queue.peek();
            int a = tmp[1];
            boolean isBigger = true;
            for (int[] ints : queue) {
                if (ints[1] > a) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                int[] tmpArr = queue.poll();
                count++;
                if (tmpArr[0] == M) break;
            } else {
                queue.add(queue.poll());
            }
        }
        System.out.println(count);
    }
}

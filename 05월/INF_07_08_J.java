import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_07_08_J {

    int answer = 0;
    int[] distance = {1, -1, 5};
    int[] check;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        Q.offer(s);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + distance[j];
                    if (nx == e) return level + 1;
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        INF_07_08_J T = new INF_07_08_J();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s, e));
    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_07_14 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] check = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            list.get(sc.nextInt()).add(sc.nextInt());
        }
        arr = new int[N + 1];
        for (int i = 2; i < N+1; i++) {
            arr[i] = bfs(list, check, 1, i);
        }
        for (int i = 2; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }

    }

    private static int bfs(ArrayList<ArrayList<Integer>> list, boolean[] check, int v, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        check[v] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int tmp = queue.poll();
                if (tmp == N) {
                    return count;
                }
                for (int j:list.get(tmp)) {
                    check[j] = true;
                    queue.add(j);
                    check[j] = false;
                }
            }
            count++;
        }
        return 0;
    }

}

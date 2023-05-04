import java.util.*;

class INF_07_14_J {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, distance;

    public void BFS(int v) {
        check[v] = 1;
        distance[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    distance[nv] = distance[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        INF_07_14_J T = new INF_07_14_J();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        distance = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}

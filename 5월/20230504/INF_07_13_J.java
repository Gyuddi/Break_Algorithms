import java.util.*;

class INF_07_13_J {
    static int n, m, result = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    public void DFS(int v) {
        if (v == n) result++;
        else {
            for (int nv : graph.get(v)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    DFS(nv);
                    check[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        INF_07_13_J T = new INF_07_13_J();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        T.DFS(1);
        System.out.println(result);
    }
}

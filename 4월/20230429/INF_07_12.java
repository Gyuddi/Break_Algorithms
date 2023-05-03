import java.util.Scanner;

public class INF_07_12 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[][] graph = new boolean[N+1][N+1];
        boolean[] check = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            graph[sc.nextInt()][sc.nextInt()] = true;
        }
        dfs(graph,check,1, N);
        System.out.println(answer);
    }
    private static void dfs(boolean[][] graph, boolean[] check, int v, int N){
        if (v == N) answer++;
        else {
            check[v] = true;
            for (int i = 1; i < N+1; i++) {
                if (graph[v][i] && !check[i]) {
                    check[i] = true;
                    dfs(graph, check, i, N);
                    check[i] = false;
                }
            }
        }
    }
}

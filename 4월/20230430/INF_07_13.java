import java.util.ArrayList;
import java.util.Scanner;

public class INF_07_13 {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        boolean[] check = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            list.get(sc.nextInt()).add(sc.nextInt());
        }
        dfs(list, check, 1, N);
        System.out.println(answer);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, boolean[] check, int v, int N) {
        if (v == N) answer++;
        else {
            check[v] = true;
            for (int i : list.get(v)) {
                if (!check[i]) {
                    check[i] = true;
                    dfs(list, check, i, N);
                    check[i] = false;
                }
            }
        }
    }
}

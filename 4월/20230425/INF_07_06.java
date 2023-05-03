import java.util.Scanner;

public class INF_07_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] checked = new boolean[N+1];
        dfs(1, N, checked);
    }
    private static void dfs(int n, int N, boolean[] checked) {
        if (n == N + 1) {
            for (int i = 0; i < n; i++) {
                if (checked[i]) System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        checked[n] = true;
        dfs(n + 1, N, checked);

        checked[n] = false;
        dfs(n + 1, N, checked);
    }
}

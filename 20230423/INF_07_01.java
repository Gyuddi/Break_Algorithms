import java.util.Scanner;

public class INF_07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dfs(N);
    }
    private static void dfs(int N){
        if (N == 0) return;
        dfs(N-1);
        System.out.print(N + " ");
    }
}

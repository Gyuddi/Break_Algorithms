import java.util.Scanner;

public class INF_07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dfs(N);
    }
    private static void dfs(int N){
        if (N == 0) return;
        dfs(N/2);
        System.out.print(N%2);
    }
}

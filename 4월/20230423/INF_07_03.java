import java.util.Scanner;

public class INF_07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dfs(N,1);
    }
    private static void dfs(int N, int answer){
        if (N == 0) {
            System.out.println(answer);
            return;
        }
        dfs(N-1, answer *= N);
    }
}

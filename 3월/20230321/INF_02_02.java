import java.util.Scanner;

public class INF_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a > max) {
                answer++;
                max = a;
            }
        }
        System.out.println(answer);
    }
}

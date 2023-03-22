import java.util.Scanner;

public class INF_02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1){
                count++;
                answer += count;
            }
            else count = 0;
        }
        System.out.println(answer);
    }
}

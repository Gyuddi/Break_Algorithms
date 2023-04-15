import java.util.Scanner;

public class BOJ_2675_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            String S = sc.next();
            String answer = "";
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < a; k++) {
                    answer += S.charAt(j);
                }
            }
            System.out.println(answer);
        }
    }
}

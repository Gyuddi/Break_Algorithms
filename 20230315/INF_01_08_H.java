import java.util.Scanner;

public class INF_01_08_H {
    public static void main(String[] args) {
        // 문제가 이상하다.... 공백이 없는 문자열을 제공한다 해놓고 왜 문자열에 공백이 있는가?
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.toLowerCase();
        S = S.replaceAll("[^a-z]", "");
        String compare = new StringBuilder(S).reverse().toString();
        if (S.equals(compare)) System.out.println("YES");
        else System.out.println("NO");
    }
}

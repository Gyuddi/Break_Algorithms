import java.util.Scanner;
import java.util.Stack;

public class INF_05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.replaceAll("\\(\\)","*");
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '*') count += stack.size();
            if (S.charAt(i) == '(') stack.push('(');
            if (S.charAt(i) == ')') {
                stack.pop();
                count++;
            }
        }
        System.out.println(count);
    }
}

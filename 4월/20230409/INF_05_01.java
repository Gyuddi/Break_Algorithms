import java.util.Scanner;
import java.util.Stack;

public class INF_05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        Stack<String> stack = new Stack<>();
        boolean answer = true;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("(")) stack.push(arr[i]);
                else {
                    if (stack.empty()) {
                        answer = false;
                        break;
                    }
                    stack.pop();
                }
        }
        if (!stack.empty()) answer = false;
        if (answer) System.out.println("YES");
        else System.out.println("NO");
    }
}

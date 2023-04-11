import java.util.Scanner;
import java.util.Stack;

public class INF_05_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")){
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2 + tmp1);
            } else if (arr[i].equals("-")){
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2 - tmp1);
            } else if (arr[i].equals("*")){
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2 * tmp1);
            } else if (arr[i].equals("/")){
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2 / tmp1);
            } else {
                stack.push(Integer.valueOf(arr[i]));
            }
        }
        System.out.println(stack.pop());
    }
}

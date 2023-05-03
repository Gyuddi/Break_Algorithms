import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class INF_05_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        Stack<String> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) stack.push(arr[i]);
            else if (arr[i].equals(")")){
                stack.pop();
            }
            else {
                if (stack.empty()) arrayList.add(arr[i]);
            }
        }
        for (String s : arrayList) {
            System.out.print(s);
        }
    }
}

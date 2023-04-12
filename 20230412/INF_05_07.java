import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        Queue<String> queue = new LinkedList<>();
        String[] arr = B.split("");
        for (String s : arr) {
            if (A.contains(s)) queue.add(s);
        }
        boolean answer = true;
        if (queue.size() != A.length()){
            answer = false;
        }else {
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != queue.poll().charAt(0)) answer = false;
            }
        }
        if (answer) System.out.println("YES");
        else System.out.println("NO");
    }
}

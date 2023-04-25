import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
입력 예시
3
1 2 3
2 4 5
3 6 7
 */
public class INF_07_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Tree tree = new Tree();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            char[] date = sc.nextLine().replaceAll(" ", "").toCharArray();
            tree.createNode(date[0], date[1], date[2]);
        }
        bfs(tree.root);
    }
    private static void bfs(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node now = queue.poll();
            System.out.print(now.data + " ");
            if (now.left != null) queue.add(now.left);
            if (now.right != null) queue.add(now.right);
        }
    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class INF_07_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Tree tree = new Tree();

        for (int i = 0; i < N; i++) {
            char[] date = sc.nextLine().replaceAll(" ", "").toCharArray();
            tree.createNode(date[0], date[1], date[2]);
        }
        System.out.println(shortestBfs(tree.root, 0));
    }

    private static int shortestBfs(Node root, int count){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                if (node.left == null && node.right == null) return count;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            count++;
        }
        return 0;
    }
}

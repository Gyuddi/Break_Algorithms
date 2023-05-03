import java.util.Scanner;

public class INF_07_09 {
    /**
     * 7
     * A B C
     * B D .
     * C E F
     * E . .
     * F . G
     * D . .
     * G . .
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Tree tree = new Tree();

        for (int i = 0; i < N; i++) {
            char[] date = sc.nextLine().replaceAll(" ", "").toCharArray();
            tree.createNode(date[0], date[1], date[2]);
        }
        System.out.println(shortestDfs(tree.root, 0));

    }

    private static int shortestDfs(Node root, int count) {
        if (root.left == null && root.right == null) return count;
        else if (root.left == null) return shortestDfs(root.right, count+1);
        else if (root.right == null) return shortestDfs(root.left, count+1);
        else {
            return Math.min(shortestDfs(root.left, count + 1), shortestDfs(root.right, count + 1));
        }
    }
}

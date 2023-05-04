import java.util.*;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

public class INF_07_10_J {
    Node2 root;

    public int BFS(Node2 root) {
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node2 cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return level;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String args[]) {
        INF_07_10_J tree = new INF_07_10_J();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        System.out.println(tree.BFS(tree.root));
    }
} 

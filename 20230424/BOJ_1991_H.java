import java.util.Scanner;

public class BOJ_1991_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Tree tree = new Tree();

        for (int i = 0; i < N; i++) {
            char[] date = sc.nextLine().replaceAll(" ", "").toCharArray();
            tree.createNode(date[0], date[1], date[2]);
        }
        preorder(tree.root);
        System.out.println();
        inorder(tree.root);
        System.out.println();
        postorder(tree.root);
    }

    private static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    private static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);

    }

    private static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
    }
}

class Node {
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    public void createNode(char data, char leftData, char rightData) {
        if (root == null) {
            root = new Node(data);

            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            searchNode(root, data, leftData, rightData);
        }
    }

    public void searchNode(Node node, char data, char leftData, char rightData) {
        if (node == null) return;
        if (node.data == data) {
            if (leftData != '.') {
                node.left = new Node(leftData);
            }
            if (rightData != '.') {
                node.right = new Node(rightData);
            }
        } else {
            searchNode(node.left, data, leftData, rightData);
            searchNode(node.right, data, leftData, rightData);
        }
    }


}

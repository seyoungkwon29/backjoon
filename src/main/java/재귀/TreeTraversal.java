package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeTraversal {
    static Node root = new Node('A');

    static class Node {
        char value;
        Node lt;
        Node rt;

        public Node(char value) {
            this.value = value;
            lt = null;
            rt = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            char value = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            insertNode(root, value, leftValue, rightValue);
        }

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }

    private static void insertNode(Node root, char value, char leftValue, char rightValue) {
        if (root.value == value) {
            root.lt = (leftValue == '.') ? null : new Node(leftValue);
            root.rt = (rightValue == '.') ? null : new Node(rightValue);
        } else {
            if (root.lt != null) insertNode(root.lt, value, leftValue, rightValue);
            if (root.rt != null) insertNode(root.rt, value, leftValue, rightValue);
        }
    }

    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.value);
        preOrder(root.lt);
        preOrder(root.rt);
    }

    private static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.lt);
        System.out.print(root.value);
        inOrder(root.rt);
    }

    private static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.lt);
        postOrder(root.rt);
        System.out.print(root.value);
    }
}

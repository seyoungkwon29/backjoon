package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree {
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
            char value = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            insertNode(root, value, leftValue, rightValue);
        }

        preOrder(root);
        System.out.println();

    }

    private static void insertNode(Node root, char value, char leftValue, char rightValue) {
        if (root.value == value) {
            root.lt = (leftValue == '.') ? null : new Node(leftValue);
            root.rt = (rightValue == '.') ? null : new Node(rightValue);
        } else {
            if (root.lt.value == value) insertNode(root.lt, value, leftValue, rightValue);
            if (root.rt.value == value) insertNode(root.rt, value, leftValue, rightValue);
        }
    }

    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        preOrder(root.lt);
        preOrder(root.rt);
    }
}

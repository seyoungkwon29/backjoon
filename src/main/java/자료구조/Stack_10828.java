package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_10828 {
    static Stack<Integer> stack;

    static int pop() {
        if (stack.isEmpty()) return -1;
        return stack.pop();
    }

    static int empty() {
        if (stack.isEmpty()) return 1;
        else return 0;
    }

    static int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.startsWith("push")) {
                int num = Integer.parseInt(order.substring(5));
                stack.push(num);
            }
            if (order.equals("pop")) {
                sb.append(pop()).append('\n');
            }
            if (order.equals("size")) {
                sb.append(stack.size()).append('\n');
            }
            if (order.equals("empty")) {
                sb.append(empty()).append('\n');
            }
            if (order.equals("top")) {
                sb.append(top()).append('\n');
            }
        }
        System.out.println(sb);
    }
}

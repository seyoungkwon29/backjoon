package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_10845 {
    static Queue<Integer> queue;

    static int pop() {
        if (queue.isEmpty()) return -1;
        return queue.poll();
    }

    static int empty() {
        if (queue.isEmpty()) return 1;
        else return 0;
    }

    static int front() {
        if (queue.isEmpty()) return -1;
        return queue.peek();
    }

    static int back() {
        if (queue.isEmpty()) return -1;
//        Object[] tmpQueue = queue.toArray();
//        return (int) tmpQueue[queue.size() - 1];
        return ((LinkedList<Integer>) queue).getLast();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.startsWith("push")) {
                int num = Integer.parseInt(order.substring(5));
                queue.add(num);
            }
            if (order.equals("pop")) {
                sb.append(pop()).append('\n');
            }
            if (order.equals("size")) {
                sb.append(queue.size()).append('\n');
            }
            if (order.equals("empty")) {
                sb.append(empty()).append('\n');
            }
            if (order.equals("front")) {
                sb.append(front()).append('\n');
            }
            if (order.equals("back")) {
                sb.append(back()).append('\n');
            }
        }
        System.out.println(sb);
    }
}

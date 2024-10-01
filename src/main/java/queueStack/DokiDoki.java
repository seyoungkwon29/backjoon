package queueStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DokiDoki {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        String answer = "Nice";

        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int idx = 1;

        while (!queue.isEmpty()) {
            if (idx == queue.peek()) {
                queue.poll();
                idx++;
            } else if (!stack.isEmpty() && idx == stack.peek()) {
                stack.pop();
                idx++;
            } else stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            if (idx == stack.peek()) {
                stack.pop();
                idx++;
            } else {
                answer = "Sad";
                break;
            }
        }

        System.out.println(answer);
    }
}

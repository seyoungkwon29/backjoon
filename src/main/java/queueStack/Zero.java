package queueStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        for (int i = 0; i < K; i++) {
            while (!stack.isEmpty()) {
                answer += stack.pop();
            }
        }
        System.out.println(answer);
    }
}

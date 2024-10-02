package z.queueStack;

import java.io.*;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        boolean flag = true;
        while (flag) {
            String input = bf.readLine();
            if (input.equals(".")) flag = false;

            Stack<Character> stack = new Stack<>();
            String answer = "yes";

            char[] arr = input.toCharArray();
            for (char c : arr) {
                if (c == '.') break;

                if (c == '(' || c == '[') stack.push(c);
                if ((c == ')' || c == ']')) {
                    if (stack.isEmpty()) {
                        answer = "no";
                        break;
                    }
                    else if (c == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            answer = "no";
                            break;
                        }
                    } else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            answer = "no";
                            break;
                        }
                    }
                }
            }
            if (!stack.isEmpty()) answer = "no";
            if (flag) stringBuilder.append(answer)
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }
}

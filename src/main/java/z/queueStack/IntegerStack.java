package z.queueStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class IntegerStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int commandNum = Integer.parseInt(st.nextToken());

            if (commandNum == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                stringBuilder
                        .append(solution(stack, commandNum))
                        .append("\n");
            }
        }
        System.out.println(stringBuilder);
    }

    public static int solution(Stack<Integer> stack, int commandNum) {
        int answer = 0;

        switch (commandNum) {
            case 2:
                if (!stack.isEmpty()) answer = stack.pop();
                else answer = -1;
                break;
            case 3:
                answer = stack.size();
                break;
            case 4:
                if (stack.isEmpty()) answer = 1;
                break;
            case 5:
                if (!stack.isEmpty()) answer = stack.peek();
                else answer = -1;
                break;
        }
        return answer;
    }
}

package z.queueStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidPS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(solution(bufferedReader.readLine()));
        }
    }

    public static String solution(String ps) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);

            if (c == '(') stack.push(c); // 여는 괄호는 스택에 저장
            else if (stack.empty()) return "NO"; // 닫는 괄호가 들어왔는데 스택이 비어있는 경우
            else stack.pop(); // 닫는 괄호일 경우 스택에서 여는 괄호 꺼내기
        }

        if (stack.empty()) return "YES";
        else return "NO";
    }
}

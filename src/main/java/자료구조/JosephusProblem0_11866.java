package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JosephusProblem0_11866 {
    static Queue<Integer> queue;
    static StringBuilder sb = new StringBuilder();

    static void josephusPermutation(int k) {
        while (!queue.isEmpty()) {

            for (int i = 0; i < k - 1; i++) {
                int num = queue.poll();
                queue.offer(num);
            }
            sb.append(queue.poll());
            if (!queue.isEmpty()) sb.append(", ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }

        sb.append("<");

        josephusPermutation(k);

        sb.append(">");
        System.out.println(sb);
    }
}

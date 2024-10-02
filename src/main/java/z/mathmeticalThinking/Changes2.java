package z.mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Changes2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());
        int[] changes = {25, 10, 5, 1};

        for (int i = 0; i < testCase; i++) {
            int total = Integer.parseInt(bf.readLine());
            for (int change : changes) {
                sb.append(total / change);
                sb.append(" ");
                total %= change;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

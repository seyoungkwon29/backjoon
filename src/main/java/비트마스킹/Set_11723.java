package 비트마스킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Set_11723 {
    static int S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            int num = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : -1;

            switch (order) {
                case "add" -> S |= (1 << num);
                case "remove" -> S &= ~(1 << num);
                case "check" -> sb.append((S & (1 << num)) == (1 << num) ? 1 : 0).append("\n");
                case "toggle" -> S ^= (1 << num);
                case "all" -> S = (1 << 21) - 1;
                case "empty" -> S = 0;
            }
        }
        System.out.println(sb);
    }
}

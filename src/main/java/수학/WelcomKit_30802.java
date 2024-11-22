package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WelcomKit_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] t_shirts = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < t_shirts.length; i++) {
            t_shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int T_count = 0;
        int P_count = N / P;

        for (int i = 0; i < t_shirts.length; i++) {
            if (t_shirts[i] != 0 && t_shirts[i] <= T) T_count++;

            if (t_shirts[i] > T) {
                t_shirts[i] -= T;
                T_count++;
                i--;
            }
        }
        sb.append(T_count).append("\n");
        sb.append(P_count).append(" ").append(N % P).append("\n");
        System.out.println(sb);
    }
}

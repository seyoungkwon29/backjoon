package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryConficient_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BinaryConficient(N, K));
    }

    static int BinaryConficient(int N, int K) {
        // 파스칼의 법칙 : (N, K) = (N - 1, K) + (N - 1, K - 1)
        if (N == 0 || N == K)
            return 1;

        return BinaryConficient(N - 1, K) + BinaryConficient(N - 1, K - 1);
    }
}

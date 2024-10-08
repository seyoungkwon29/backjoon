package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Hanoi_1914 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        BigInteger bi = new BigInteger("2");

        sb.append(bi.pow(n).subtract(BigInteger.ONE)).append('\n');

        if (n <= 20) {
            hanoi(n, 1, 2, 3);
        }

        System.out.println(sb);
    }

    static void hanoi(int n, int start, int mid, int to) {

        if (n == 1) {
            sb.append(start).append(' ').append(to).append('\n');
            return;
        }

        // 1 : n - 1 번째 원판까지 start -> mid 로 이동
        hanoi(n - 1, start, to, mid);
        // 2 : n 번째 원판 start -> to 로 이동
        sb.append(start).append(' ').append(to).append('\n');
        // 3 : n - 1 번째 원판 mid -> to 로 이동
        hanoi(n - 1, mid, start, to);
    }
}

package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi_11729 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 2, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    static void hanoi(int N, int start, int mid, int to) {
        count++;

        // 가장 마지막 N번째 원판 이동
        if (N == 1) {
            sb.append(start).append(' ').append(to).append('\n');
            return;
        }

        // 1번 원판 ~ N-1번째 원판 : start -> mid 로 이동하기
        hanoi(N - 1, start, to, mid);
        // N번째 원판 이동하기
        sb.append(start).append(' ').append(to).append('\n');
        // 1번 원판 ~ N-1번째 원판 : mid -> to 로 이동하기
        hanoi(N - 1, mid, start, to);
    }
}

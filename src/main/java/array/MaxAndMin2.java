package array;

import java.io.*;
import java.util.StringTokenizer;

public class MaxAndMin2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(bf.readLine()); // 배열 토큰화
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(token.nextToken());
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}

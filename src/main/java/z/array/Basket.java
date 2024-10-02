package z.array;

import java.io.*;
import java.util.StringTokenizer;

public class Basket {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];
        int ball;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            ball = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j++) {
                basket[j] = ball;
            }
        }

        for (int i = 1; i < basket.length ; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
    }
}

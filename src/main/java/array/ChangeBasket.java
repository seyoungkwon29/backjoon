package array;

import java.io.*;
import java.util.StringTokenizer;

public class ChangeBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];
        int ball;

        for (int i = 1; i < basket.length; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            ball = basket[first];
            basket[first] = basket[second];
            basket[second] = ball;
        }

        for (int i = 1; i < basket.length ; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
    }
}

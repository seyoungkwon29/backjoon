package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            int[] copyArr = Arrays.copyOfRange(basket, from, to + 1);

            for(int j = 0; j < copyArr.length; j++) {
                basket[from + j] = copyArr[copyArr.length - (j + 1)];
            }
        }

        for (int num : Arrays.copyOfRange(basket, 1, basket.length)) {
            System.out.print(num + " ");
        }
    }
}
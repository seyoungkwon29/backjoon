package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseBasketList {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i;
        }

        List<Integer> list = new ArrayList<>(Arrays.stream(basket).boxed().collect(Collectors.toList()));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            List<Integer> subList = list.subList(from, to + 1);
            Collections.reverse(subList);
        }

        for (int num : list.subList(1, list.size())) {
            System.out.print(num + " ");
        }
    }
}
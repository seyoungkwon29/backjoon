package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            cards.add(i);
        }

        int count = 1;
        while (cards.size() > 1) {
            int card = cards.poll();

            if (count % 2 == 0) {
                cards.add(card);
            }

            count++;
        }

        System.out.println(cards.poll());
    }
}

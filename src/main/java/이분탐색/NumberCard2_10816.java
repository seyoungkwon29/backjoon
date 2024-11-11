package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2_10816 {
    static int[] cards;
    static int[] cardsToFind;

    static int searchCards(int toFind) {
        // 찾을 카드의 시작 위치 찾기
        int lt = lowerBound(toFind);
        // 찾을 카드의 마지막 위치 찾기
        int rt = upperBound(toFind);

        // 값이 존재하지 않는 경우
        if (lt == rt) return 0;

        // 인덱스 차 == 해당 카드 개수
        return rt - lt;
    }

    static int lowerBound(int toFind) {
        int lt = 0;
        int rt = cards.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (cards[mid] < toFind) lt = mid + 1;
            else rt = mid;
        }
        return lt;
    }

    static int upperBound(int toFind) {
        int lt = 0;
        int rt = cards.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (cards[mid] <= toFind) lt = mid + 1;
            else rt = mid;
        }

        return lt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        cards = new int[n];

        // 가진 카드 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 이분탐색을 위해 가진 카드 정렬
        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        cardsToFind = new int[m];

        // 찾아야 할 카드 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            cardsToFind[i] = Integer.parseInt(st.nextToken());
        }

        // 카드 찾기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cardsToFind.length; i++) {
            sb.append(searchCards(cardsToFind[i])).append(" ");
        }
        System.out.println(sb);
    }
}

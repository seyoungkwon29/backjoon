package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2_10816 {
    static int[] cards;
    static int[] cardsToFind;

    static int searchCards(int index) {
        int lt = 0;
        int rt = cards.length - 1;
        int toFind = cardsToFind[index];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            // 찾아야 할 카드가 중간 카드보다 작을 경우 앞 부분 탐색
            if (cards[mid] > toFind)
                rt = mid - 1;
            // 찾아야 할 카드가 중간 카드보다 클 경우 뒷 부분 탐색
            else if (cards[mid] < toFind)
                lt = mid + 1;
            else {
                int count = 0;
                for (int i = lt; i < rt + 1; i++) {
                    if (cards[i] == toFind) count++;
                }
                return count;
            }
        }
        return 0;
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
            sb.append(searchCards(i)).append(" ");
        }
        System.out.println(sb);
    }
}

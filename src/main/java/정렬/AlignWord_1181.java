package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AlignWord_1181 {
    static String[] words;

    static void alignWords() {
        Arrays.sort(words, (o1, o2) -> {
            // 단어 길이가 같을 경우
            if (o1.length() == o2.length()) {
                // 사전 순으로
                // compareTo() : 문자열 같을 때 0, 다를 때 문자열 길이의 차 반환
                // 주의할 점 : 같은 위치의 값만 비교한다. 처음부터 문자열이 다를 경우 아스키값 차이 반환
                return o1.compareTo(o2);
            } else
                return o1.length() - o2.length();
        });

        System.out.println(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1]))
                System.out.println(words[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        words = new String[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            words[i] = st.nextToken();
        }

        alignWords();
    }
}

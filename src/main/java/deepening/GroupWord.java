package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupWord {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int answer = count;


        for (int i = 0; i < count; i++) {
            int[] alphabet = new int[26];
            char previousAlphabet = '!';
            String word = new StringTokenizer(bf.readLine()).nextToken();

            for (int j = 0; j < word.length(); j++) {
                char thisAlphabet = word.charAt(j);

                if (previousAlphabet != thisAlphabet) {
                    if (alphabet[thisAlphabet - 'a'] == 0) {
                        alphabet[thisAlphabet - 'a'] = 1;
                        previousAlphabet = thisAlphabet;
                    } else {
                        answer--;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

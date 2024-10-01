package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Repetition {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    sb.append(word.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

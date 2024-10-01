package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String[] word = st.nextToken().split("");
        int count = word.length;

        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("=")) {
                if (word[i - 1].equals("c") || word[i - 1].equals("s")) {
                    count--;
                }
                if (word[i - 1].equals("z")) {
                    count--;
                    if ((i - 2) >= 0 && word[i - 2].equals("d")) {
                        count--;
                    }
                }
            }
            if (word[i].equals("-")) {
                if (word[i - 1].equals("c") || word[i - 1].equals("d")) {
                    count--;
                }
            }
            if (word[i].equals("j")) {
                if ((i - 1) >= 0 && word[i - 1].equals("l") || (i - 1) >= 0 && word[i - 1].equals("n")) {
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}

package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] chars = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(word.length() - i - 1);
        }

        String palindrome = String.valueOf(chars);

        if (!word.equals(palindrome)) System.out.println(0);
        else System.out.println(1);
    }
}

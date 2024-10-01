package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostUsedAlphabet2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine().toUpperCase();
        int[] alphabet = new int[26];
        char answer = 0;
        
        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 65]++;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                answer = (char) (i + 65);
            } else if (alphabet[i] == max) {
                answer = '?' ;
            }
        }

        System.out.println(answer);
    }
}

package deepening;

import java.io.*;

public class MostUsedAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine().toUpperCase();
        int[] alphabet = new int[26];
        char answer = '?';
        
        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 65]++;
        }

        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int j : alphabet) {
            if (max == j && max != 0) {
                temp = max;
            }
            max = Math.max(max, j);
        }

        if (temp != max) {
            max = Math.max(temp, max);
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == max) {
                    answer = (char) (i + 65);
                }
            }
        }

        System.out.println(answer);
    }
}

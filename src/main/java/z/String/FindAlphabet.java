package z.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 97;
            if (alphabet[index] == -1) alphabet[index] = i;
        }
        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}

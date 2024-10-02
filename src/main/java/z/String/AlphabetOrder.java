package z.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetOrder {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        int idx = Integer.parseInt(bf.readLine());

        System.out.println(word.charAt(idx - 1));
    }
}


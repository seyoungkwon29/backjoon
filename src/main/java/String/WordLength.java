package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordLength {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();

        System.out.println(word.length());
    }
}

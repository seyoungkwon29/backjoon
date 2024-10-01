package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLastLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            String word = bf.readLine();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
        }
    }
}

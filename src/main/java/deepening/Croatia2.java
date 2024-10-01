package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        while (true) {
            boolean flag = false;

            for (String s : croatian) {
                if (word.contains(s)) {
                    int startPos = word.indexOf(s);
                    int endPos = word.indexOf(s) + s.length() - 1;
                    word = word.substring(0, startPos).concat(word.substring(endPos + 1));
                    System.out.println("startPos = " + startPos + " | " + "endPos = " + endPos);
                    System.out.println("word = " + word);
                    flag = true;
                    count++;
                }
            }
            if (!flag) break;
        }

        System.out.println(count + word.length());
    }
}

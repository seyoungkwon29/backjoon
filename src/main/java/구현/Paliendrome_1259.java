package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paliendrome_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String num = br.readLine();
            int count = 0;
            if (num.equals("0")) break;

            for (int i = 0; i < num.length() / 2; i++) {
                if (num.charAt(i) == num.charAt(num.length() - 1 - i)) {
                    count++;
                }
            }
            if (count == num.length() / 2) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.println(sb);
    }
}

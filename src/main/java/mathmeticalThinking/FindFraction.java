package mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int denominator = 0; // 분모
        int numerator = 0; // 분자
        int count = 0;
        int index = 1;

        while (count < n) {
            count += index;
            index++;
        }

        // 합이 홀수일 경우 분자가 1부터
        if ((index - 1) % 2 == 1) {
            denominator = index - 1 - (count - n);
            numerator = count - n + 1;
        } else {
            denominator = count - n + 1;
            numerator = index - 1 - (count - n);
        }

        System.out.printf("%d/%d", numerator, denominator);
    }
}
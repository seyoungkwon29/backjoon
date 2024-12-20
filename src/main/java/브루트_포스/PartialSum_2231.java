package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartialSum_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (i + sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

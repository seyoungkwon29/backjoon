package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOneToN {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}

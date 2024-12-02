package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne_1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while (true) {
            dp(n);
            if (n == 1) break;
        }

        System.out.println(count);
    }

    static void dp(int n) {
        if (n % 2 == 0) n /= 2;
        if (n % 3 == 0) n /= 3;
        n -= 1;
    }
}

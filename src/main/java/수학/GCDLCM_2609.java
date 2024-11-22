package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDLCM_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        int gcd = GreatestCommonDivisor(n, m);
        int lcm = n * m / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int GreatestCommonDivisor(int n, int m) {
        int l = Math.max(n, m);
        int s = Math.min(n, m);

        // 유클리드 호제법
        if (l % s == 0) {
            return s;
        }

        return GreatestCommonDivisor(s, l % s);
    }
}

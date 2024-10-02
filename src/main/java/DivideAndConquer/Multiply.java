package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiply {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long base = Integer.parseInt(st.nextToken());        // 밑
        long exponent = Integer.parseInt(st.nextToken());    // 지수
        long num = Integer.parseInt(st.nextToken());         // 나눌 수

        System.out.println(modular(base, exponent, num));
    }

    static long modular(long base, long exponent, long num) {
        if (exponent == 1) return base % num;

        long temp = modular(base, exponent / 2, num);

        // 지수가 홀수일 때
        // 10 ^ 5 * 10 ^ 5 * 10 <- base를 한번 더 곱한 후 나머지
        if (exponent % 2 == 1) {
            return (temp * temp % num) * base % num;
        }
        return (temp * temp) % num;
    }
}

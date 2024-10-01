package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int from = Integer.parseInt(bf.readLine());
        int to = Integer.parseInt(bf.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean[] isPrime = new boolean[to + 1];

        Arrays.fill(isPrime, true); // true 로 초기화
        isPrime[0] = isPrime[1] = false; // 0, 1은 소수가 아니다

        for (int i = 2; i <= Math.sqrt(to); i++) { // 2부터 to의 제곱근까지 확인하면 됨
            if (isPrime[i]) {
                // isPrime[] = true 면 소수로 등록하고 i의 배수 j는 지우기
                // i * i 미만의 수 (i * 2, i * 3, ..)는 i가 2, 3, .. 일 떄 지워지기 때문에 i * i 부터
                // j += i : j는 i의 제곱부터 시작해서 i의 배수 지우기
                for (int j = i * i; j <= to; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = from; i <= to; i++) { // from ~ to 중 소수
            if (isPrime[i]) {
                sum += i;
                min = Math.min(min, i);
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println(-1);
    }
}

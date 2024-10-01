package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(bf.readLine());
        boolean[] isPrime = new boolean[number + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // 소수 찾기
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (number >= 2) {
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    if (number % i == 0) {
                        System.out.println(i);
                        number /= i;
                        break;
                    }

                }
            }
        }
    }
}

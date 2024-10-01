package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorization2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(bf.readLine());

        while (number >= 2) {
            boolean p = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    p = false;
                    sb.append(i).append("\n");
                    number /= i;
                    break;
                }
            }
            if (p) {
                sb.append(number);
                number /= number;
            }
        }
        System.out.println(sb);
    }
}

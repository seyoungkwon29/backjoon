package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int ans = 0;

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            int[] primeNumber = new int[number];

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    primeNumber[j] = 1;
                }
            }
            Arrays.sort(primeNumber);
            if (primeNumber[primeNumber.length - 1] == 0) ans++;
            if (number == 1) ans--;
        }
        System.out.println(ans);

    }
}

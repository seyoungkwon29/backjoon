package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Factors {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] factors = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[i] = 1;
            }
        }

        int count = 0;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (factors[i] == 1) {
                count++;
                if (count == k) answer = i;
            }
        }

        System.out.println(answer);
    }
}

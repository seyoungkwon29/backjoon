package z.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleFactor2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(bf.readLine());
            int numberA = Integer.parseInt(st.nextToken());
            int numberB = Integer.parseInt(st.nextToken());

            if (numberA == 0 && numberB == 0) break;

            if (Math.max(numberA, numberB) % Math.min(numberA, numberB) == 0) {
                if (Math.max(numberA, numberB) == numberA) System.out.println("multiple");
                else System.out.println("factor");
            } else System.out.println("neither");

        }

    }
}

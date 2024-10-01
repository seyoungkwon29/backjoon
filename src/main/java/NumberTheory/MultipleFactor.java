package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleFactor {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numberA = 1;
        int numberB = 1;

        while (numberA != 0 && numberB != 0) {
            st = new StringTokenizer(bf.readLine());
            numberA = Integer.parseInt(st.nextToken());
            numberB = Integer.parseInt(st.nextToken());
            int biggerNumber = Math.max(numberA, numberB);

            if (numberA == 0 && numberB == 0) {
                break;
            } else if (biggerNumber == numberA) {
                if (numberA % numberB == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (numberB % numberA == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }
        }

    }
}

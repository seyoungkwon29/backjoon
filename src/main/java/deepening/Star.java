package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            printSpace(n - i - 1);
            printStars(2 * i + 1);
            System.out.println();
        }

        for (int i = n - 2; i > -1; i--) {
            printSpace(n - i - 1);
            printStars(2 * i + 1);
            System.out.println();
        }
    }

    public static void printSpace(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
    }
}

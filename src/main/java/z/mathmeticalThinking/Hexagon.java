package z.mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hexagon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int room = Integer.parseInt(bf.readLine());
        int count = 1;
        int firstRoom = 1;

        while (firstRoom < room) {
            firstRoom += (6 * count);
            count++;
        }

        System.out.println(count);
    }
}

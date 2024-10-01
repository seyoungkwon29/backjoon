package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Triangle2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] side = new int[3];

            for (int i = 0; i < side.length; i++) {
                side[i] = Integer.parseInt(st.nextToken());
            }
            if (side[0] == 0) break;

            Arrays.sort(side);
            if (side[0] + side[1] <= side[2]) System.out.println("Invalid");
            else if (side[0] != side[1] && side[1] != side[2]) System.out.println("Scalene");
            else if (side[0] == side[1] && side[1] == side[2]) System.out.println("Equilateral");
            else System.out.println("Isosceles");
        }
    }
}

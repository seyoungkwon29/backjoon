package z.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] sides = new int[3];

        for (int i = 0; i < sides.length; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            sides[2] = sides[0] + sides[1] - 1;
        }

        int answer = 0;
        for (int s : sides) {
            answer += s;
        }

        System.out.println(answer);

    }
}

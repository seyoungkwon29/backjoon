package z.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int count : chess) {
            System.out.print((count - Integer.parseInt(st.nextToken())) + " ");
        }
    }
}

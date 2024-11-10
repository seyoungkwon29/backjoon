package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chess_1018 {
    static String[][] chess;
    static int m;
    static int n;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        chess = new String[m][n];

        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split("");
            chess[i] = Arrays.copyOf(line, n);
        }

        for (int i = 0; i < m - 7; i++) {
            for (int j = 0; j < n - 7; j++) {
                check(i, j);
            }
        }

        System.out.println(min);
    }

    static void check(int row, int col) {
        int count = 0;
        String startWith = chess[row][col];

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (!startWith.equals(chess[i][j]))
                    count++;

                if (startWith.equals("W")) startWith = "B";
                else startWith = "W";
            }

            if (startWith.equals("W")) startWith = "B";
            else startWith = "W";
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}

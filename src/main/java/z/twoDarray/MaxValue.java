package z.twoDarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] matrix = new int[9][9];
        int tmp = Integer.MIN_VALUE;
        int max = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                tmp = Math.max(tmp, matrix[i][j]);

                if (tmp != max) {
                    max = tmp;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        if (max == 0) System.out.printf("%d %d", 1, 1);
        else System.out.printf("%d %d", row, col);
    }
}
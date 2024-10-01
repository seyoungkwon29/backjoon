package twoDarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VerticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int row = 5;
        int col = 15;
        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            String[] arr = new StringTokenizer(bf.readLine()).nextToken().split("");
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] == null) sb.append("");
                else sb.append(matrix[j][i]);
            }
        }
        System.out.println(sb);
    }
}
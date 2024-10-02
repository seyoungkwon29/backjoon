package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoredPaper {
    static StringBuilder sb = new StringBuilder();
    static int[][] coloredPaper;
    static int ZERO = 0;
    static int ONE = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        coloredPaper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                coloredPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        coloredPaper(0, 0, N);

        sb.append(ZERO);
        sb.append("\n");
        sb.append(ONE);
        System.out.println(sb);
    }

    public static void coloredPaper(int x, int y, int size) {
        if (isAllSame(x, y, size)) {
            if (coloredPaper[x][y] == 0) ZERO++;
            if (coloredPaper[x][y] == 1) ONE++;
            return;
        }

        size /= 2;
        coloredPaper(x, y, size); // 왼쪽 위
        coloredPaper(x, y + size, size); // 오른쪽 위
        coloredPaper(x + size, y, size); // 왼쪽 아래
        coloredPaper(x + size, y + size, size); // 오른쪽 아래
    }

    static boolean isAllSame(int x, int y, int size) {
        int value = coloredPaper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (value != coloredPaper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

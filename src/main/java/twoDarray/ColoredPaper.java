package twoDarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[][] paper = new int[100][100];
        int pcs = Integer.parseInt(st.nextToken());
        int answer = 0;

        // x, y 값 입력 받기
        // 입력된 x, y부터 +10 까지의 범위에 있는 배열 값을 1로 초기화
        for (int i = 0; i < pcs; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                if (paper[i][j] == 1) {
                    answer += paper[i][j];
                }
            }
        }

        System.out.println(answer);
    }
}

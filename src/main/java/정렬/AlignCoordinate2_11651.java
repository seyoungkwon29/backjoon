package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AlignCoordinate2_11651 {
    static int[][] coordinate;

    static void order() {

        Arrays.sort(coordinate, (e1, e2) -> {
            // y 좌표가 같으면 x 좌표 오름차순 정렬
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            }
            // y 좌표 오름차순 정렬
            else
                return e1[1] - e2[1];
        });

        for (int[] point : coordinate) {
            System.out.println(point[0] + " " + point[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        coordinate = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            coordinate[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            coordinate[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        order();
    }
}

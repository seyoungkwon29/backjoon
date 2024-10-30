package BFS;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] cabbage;
    static int M, N, K;
    static Queue<Point> queue;
    static boolean[][] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        // 테스트 케이스
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbage = new int[M][N]; // 배추 위치 배열 초기화
            visit = new boolean[M][N]; // 방문 배열 초기화

            // 배추 위치 입력
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                cabbage[x][y] = 1;
            }
            // 지렁이 심기
            earthworm();
        }

        System.out.println(sb);
    }
    static void earthworm() {
        int count = 0;
        queue = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                // 배추가 심어져있고 방문하지 않은 구역
                if (cabbage[i][j] == 1 && !visit[i][j]) {
                    queue.add(new Point(i, j));
                    visit[i][j] = true;
                }

                while (!queue.isEmpty()) {
                    Point point = queue.poll();

                    if (cabbage[point.x][point.y] == 0) {
                        continue;
                    }

                    for (int k = 0; k < 4; k++) {
                        int nextX = point.x + dx[k];
                        int nextY = point.y + dy[k];

                        if (nextX < 0 || nextX == M || nextY < 0 || nextY == N) {
                            continue;
                        }

                        if (cabbage[nextX][nextY] == 0) {
                            continue;
                        }

                        if (visit[nextX][nextY]) {
                            continue;
                        }

                        queue.add(new Point(nextX, nextY));
                        visit[nextX][nextY] = true;
                    }

                    if (queue.isEmpty()) count++;
                }
            }
        }
        sb.append(count).append("\n");
    }
}

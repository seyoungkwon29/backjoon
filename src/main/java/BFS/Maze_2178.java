package BFS;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze_2178 {
    static int n;
    static int m;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // x축 상하좌우
    static int[] dy = {0, 0, -1, 1}; // y축 상하좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        BFS(0, 0);

        System.out.println(maze[n - 1][m - 1]);
    }

    static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextdx = currentPoint.x + dx[i];
                int nextdy = currentPoint.y + dy[i];

                // 1. 상하좌우 범위가 미로를 넘어서는가?
                if (nextdx < 0 || nextdx >= n || nextdy < 0 || nextdy >= m)
                    continue;

                // 2. 다음 이동할 칸이 0인가?
                if (maze[nextdx][nextdy] == 0)
                    continue;

                // 3. 방문한 칸인가?
                if (visited[nextdx][nextdy])
                    continue;

                queue.offer(new Point(nextdx, nextdy));
                visited[nextdx][nextdy] = true;
                maze[nextdx][nextdy] = maze[currentPoint.x][currentPoint.y] + 1;
            }
        }
    }
}

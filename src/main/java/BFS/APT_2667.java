package BFS;

import javax.management.QueryEval;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class APT_2667 {
    static int[][] apt;
    static boolean[][] map;
    static Queue<Point> queue;
    static Queue<Integer> answer;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int danji;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        apt = new int[n][n];
        map = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                apt[i][j] = line.charAt(j) - '0';
            }
        }
        BFS(0, 0);

        System.out.println(danji + 1);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    static void BFS(int x, int y) {
        queue = new LinkedList<>();
        answer = new LinkedList<>();
        queue.add(new Point(x, y));

        int tmp = 0;

        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt.length; j++) {
//                System.out.println("i, j = " + i + ", " + j);

                if (!map[i][j] && apt[i][j] == 1) {
                    danji++;
                    map[i][j] = true;
                    queue.add(new Point(i, j));
                    answer.add(tmp);
                    tmp = 0;
                }

                while (!queue.isEmpty()) {
                    Point point = queue.poll();
                    int nextX;
                    int nextY;
                    for (int k = 0; k < 4; k++) {
                        nextX = point.x + dx[k];
                        nextY = point.y + dy[k];

                        if (nextX < 0 || nextX >= apt.length || nextY < 0 || nextY >= apt.length) {
                            continue;
                        }

                        if (map[nextX][nextY]) {
                            continue;
                        }

                        if (apt[nextX][nextY] == 1) {
                            map[nextX][nextY] = true;
                            queue.add(new Point(nextX, nextY));
                            tmp++;
                            System.out.println("현재 위치 : [" + nextX + "][" + nextY + "]");
                        }
                    }
                }
            }
        }
    }
}

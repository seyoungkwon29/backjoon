package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maze_17090 {
    static char[][] maze;
    static boolean[][] visited;
    static Boolean[][] canEscape;
    static int n;
    static int m;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 미로, 탈출 가능한 칸인지 아닌지 확인할 배열 생성
        maze = new char[n][m];
        visited = new boolean[n][m];
        canEscape = new Boolean[n][m];

        // 미로 입력
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j);
            }
        }

        // 탈출 여부가 불분명할 때 DFS() 실행
        // true -> count++
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (canEscape[i][j] == null) {
                    visited = new boolean[n][m];
                    if (DFS(i, j)) {
                        count++;
                    }
                } else if (canEscape[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static boolean DFS(int row, int col) {
        if (canEscape[row][col] != null)
            return canEscape[row][col];

        // 방문 체크
        visited[row][col] = true;

        int newRow = row;
        int newCol = col;

        switch (maze[row][col]) {
            case 'U' :
                newRow--;
                break;
            case 'D' :
                newRow++;
                break;
            case 'L' :
                newCol--;
                break;
            case 'R' :
                newCol++;
                break;
        }

        // 이동할 칸이 범위 넘어가면 탈출
        // 이동하기 전 칸 true
        if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m) {
            canEscape[row][col] = true;
//            count++;
        } else if (visited[newRow][newCol]) {
            canEscape[row][col] = false;
        } else {
            // 다음 칸에 대해 DFS 실행
            canEscape[row][col] = DFS(newRow, newCol);
//            if (canEscape[row][col]) count++;
        }

        return canEscape[row][col];
    }
}


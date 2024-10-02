package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, N);
        System.out.println(sb);
    }

    public static void QuadTree(int x, int y, int size) {
        // 전부 같은 값이면 기준값 하나만 프린트
        if (isAllSame(x, y, size)) {
            sb.append(arr[x][y]);
            return;
        }

        // 같은 값이 아닐 경우 범위 나누기
        size /= 2;
        sb.append('(');

        QuadTree(x, y, size); // 왼쪽 위
        QuadTree(x, y + size, size); // 오른쪽 위
        QuadTree(x + size, y, size); // 왼쪽 아래
        QuadTree(x + size, y + size, size); // 오른쪽 아래

        sb.append(')');
    }

    public static boolean isAllSame(int x, int y, int size) {
        int value = arr[x][y]; // 기준값 설정

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                // 기준값과 size만큼의 범위에 있는 수들 비교
                if (value != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

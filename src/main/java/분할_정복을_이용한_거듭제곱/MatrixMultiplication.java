package 분할_정복을_이용한_거듭제곱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixMultiplication {
    static int MOD = 1000;
    static int N;
    static long B;
    static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());
        A = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken()) % MOD;
            }
        }

        int[][] result = matrix(B, A);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int[][] matrix(long B, int[][] A) {
        if (B == 1L) return A;

        // 지수를 절반으로 분할하여 재귀호출
        int[][] temp = matrix(B / 2, A);

        // 하위 재귀에서 얻은 행렬을 제곱해준다.
        temp = multiply(temp, temp);

        // 지수가 홀수일 경우 원행렬을 한번 더 곱한다.
        if (B % 2 == 1) {
            temp = multiply(temp, A);
        }

        return temp;
    }

    static int[][] multiply(int[][] arr1, int[][] arr2) {

        int[][] temp = new int[N][N];

        // 행렬 제곱 계산 후 항상 1000으로 나눈 나머지 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    temp[i][j] += arr1[i][k] * arr2[k][j];
                }
                temp[i][j] %= MOD;
            }
        }
        return temp;
    }
}

package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber_1920 {
    static int[] A;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        B = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < B.length; i++) {

            if (find(B[i])) {
                sb.append(1).append('\n');
            }
            else
                sb.append(0).append('\n');
        }

        System.out.println(sb);
    }

    static boolean find(int num) {
        int lt = 0;             // 탐색 범위 왼쪽 인덱스
        int rt = A.length - 1;  // 탐색 범위 오른쪽 인덱스

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            // 중간 인덱스의 숫자가 내가 찾을 숫자보다 작을 경우 가장 오른쪽 인덱스를 중간 인덱스 - 1 위치로 이동
            if (num < A[mid]) rt = mid - 1;
            // 중간 인덱스의 숫자가 내가 찾을 숫자보다 큰 경우 가장 왼쪽 인덱스를 중간 인덱스 + 1 위치로 이동
            else if (num > A[mid]) lt = mid + 1;
            // 정확히 같을 경우
            else
                return true;
        }
        return false;
    }
}

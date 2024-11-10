package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] B = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < B.length; i++) {
            boolean TF = false;
            for (int j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    sb.append(1).append("\n");
                    TF = true;
                    break;
                }
            }

            if (!TF) {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }
}

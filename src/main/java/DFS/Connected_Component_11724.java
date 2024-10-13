package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Connected_Component_11724 {
    static ArrayList<Integer>[] arr;
    static boolean[] isChecked;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
        isChecked = new boolean[n + 1];

        // 리스트 초기화
        for (int i = 1; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        // 배열 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u].add(v);
            arr[v].add(u);
        }

        for (int i = 1; i < n + 1; i++) {
            if (!isChecked[i]) {
                count++;
                findConnection(i);
            }
        }

        System.out.println(count);
    }

    static void findConnection(int index) {
        if (isChecked[index]) return;

        isChecked[index] = true;
        for (int i : arr[index]) {
            if (!isChecked[i])
                findConnection(i);
        }
    }
}

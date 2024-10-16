package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFSandBFS_1260 {
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] arrList;
    static Queue<Integer> queue;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arrList = new ArrayList[n + 1];
        queue = new LinkedList<>();
        visited = new boolean[n + 1];

        // 배열 리스트 초기화
        for (int i = 1; i < n + 1; i++) {
            arrList[i] = new ArrayList<>();
        }

        // 입력받아서 양방향 간선 (2차원 배열로도 가능)
        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arrList[a].add(e);
            arrList[e].add(a);
        }

        // 배열 리스트가 가진 배열 정렬
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(arrList[i]);
        }

        DFS(v);

        // 방문 배열 초기화
        Arrays.fill(visited, false);

        BFS(v);

        System.out.println(sb);
    }

    static void DFS(int node) {
        if (visited[node])
            return;
        else {
            visited[node] = true;
            sb.append(node).append(" ");

            for (int i = 0; i < arrList[node].size(); i++) {
                int nextNode = arrList[node].get(i);

                if (!visited[nextNode]) {
                    DFS(nextNode);
                }
            }
        }
    }

    static void BFS(int node) {
        queue.add(node);
        visited[node] = true;
        sb.append("\n").append(node).append(" ");

        while (!queue.isEmpty()) {
            int index = queue.poll();

            for (int i = 0; i < arrList[index].size(); i++) {
                int nextNode = arrList[index].get(i);
                if (!visited[nextNode]) {
                    queue.add(nextNode);
                    visited[nextNode] = true;
                    sb.append(nextNode).append(" ");
                }
            }
        }
    }
}

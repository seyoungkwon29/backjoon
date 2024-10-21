package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus_2606 {
    static ArrayList<Integer>[] computers;
    static Queue<Integer> queue;
    static boolean[] infected;
    static int FIRST = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int count = 0;

        computers = new ArrayList[n + 1];
        infected = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            computers[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            computers[a].add(b);
            computers[b].add(a);
        }

        BFS();

        for (int i = 2; i < infected.length; i++) {
            if (infected[i]) count++;
        }
        System.out.println(count);
    }

    static void BFS() {
        queue = new LinkedList<>();
        queue.add(FIRST);

        infected[FIRST] = true;

        while (!queue.isEmpty()) {
            int index = queue.poll();

            for (int i = 0; i < computers[index].size(); i++) {
                int nextIndex = computers[index].get(i);

                if (!infected[nextIndex]) {
                    queue.add(nextIndex);
                    infected[nextIndex] = true;
                }
            }
        }
    }
}

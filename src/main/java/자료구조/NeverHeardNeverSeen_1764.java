package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NeverHeardNeverSeen_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> name1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            name1.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (name1.contains(name)) {
                list.add(name);
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for (String name : list) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}

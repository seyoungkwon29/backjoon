package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Pokemon_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> pokemonName = new HashMap<>();
        Map<String, Integer> pokemonNum = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String name = br.readLine();
            pokemonName.put(i, name);
            pokemonNum.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            // 번호로 찾을 때
            if (input.matches("\\d+"))
                sb.append(pokemonName.get(Integer.parseInt(input))).append("\n");
            // 이름으로 찾을 때
            else
                sb.append(pokemonNum.get(input)).append("\n");
        }
        System.out.println(sb);
    }
}

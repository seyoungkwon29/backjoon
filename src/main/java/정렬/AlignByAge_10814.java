package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AlignByAge_10814 {
    static String[][] members;

//    static void alignWithArrays(int n) {
//        Arrays.sort(members, (e1, e2) -> {
//            int age1 = Integer.parseInt(e1[0]);
//            int age2 = Integer.parseInt(e2[0]);
//
//            if (age1 == age2) {
//                return 0;
//            } else
//                return age1 - age2;
//        });
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(members[i][0] + " " + members[i][1]);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        members = new String[n][2];

        StringTokenizer st;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            String age = String.valueOf(st.nextToken());
//            String name = String.valueOf(st.nextToken());
//
//            members[i][0] = age;
//            members[i][1] = name;
//        }
//
//        alignWithArrays(n);

        StringBuilder[] stringBuilders = new StringBuilder[201];

        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            stringBuilders[age].append(age)
                    .append(" ")
                    .append(st.nextToken())
                    .append('\n');
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder val : stringBuilders) {
            sb.append(val);
        }

        System.out.println(sb);
    }
}

package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final String[] GRADE = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        final double[] SCORE = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double totalCredit = 0.0; // 학점 총합
        double totalScore = 0.0; // 평점 총합

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(bf.readLine());
            st.nextToken(); // 과목명
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken(); // 평점

            // P는 제외
            if (!grade.equals("P")) {
                for (int j = 0; j < GRADE.length; j++) {
                    if (grade.equals(GRADE[j])) {
                        totalScore += (credit * SCORE[j]);
                    }
                }
                totalCredit += credit;
            }
        }

        System.out.printf("%.6f", totalScore / totalCredit);
    }
}

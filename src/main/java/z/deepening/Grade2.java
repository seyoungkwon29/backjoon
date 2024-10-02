package z.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final String[] GRADE = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        final float[] SCORE = {4.5f, 4.0f, 3.5f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f, 0.0f};
        float totalCredit = 0.0f; // 학점 총합
        float totalScore = 0.0f; // 평점 총합

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(bf.readLine());
            st.nextToken(); // 과목명
            float credit = Float.parseFloat(st.nextToken());
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

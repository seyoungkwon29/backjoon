package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = 20;
        float totalCredit = 0.0f;
        float totalGrade = 0.0f;

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(bf.readLine());
            st.nextToken(); // 과목명
            float credit = Float.parseFloat(st.nextToken());
            String subjectGrade = st.nextToken(); // 평점
            float grade = 0.0f; // 숫자로 변환한 평점

            switch (subjectGrade) {
                case "A+" : grade = 4.5f; break;
                case "A0" : grade = 4.0f; break;
                case "B+" : grade = 3.5f; break;
                case "B0" : grade = 3.0f; break;
                case "C+" : grade = 2.5f; break;
                case "C0" : grade = 2.0f; break;
                case "D+" : grade = 1.5f; break;
                case "D0" : grade = 1.0f; break;
                case "F"  : grade = 0.0f; break;
                case "P"  : credit = 0.0f; break;
            }
            totalGrade += (credit * grade);
            totalCredit += credit;
        }

        System.out.printf("%.6f", totalGrade / totalCredit);
    }
}

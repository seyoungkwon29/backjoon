package z.mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ToDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String number = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            char num = number.charAt(number.length() - i - 1); // 1의 자리 수부터 (아스키코드로 반환하기 때문에 숫자를 해당 숫자로 얻기 위해서는 -'0'을 해야한다.
            if ('A' <= num && num <= 'Z') {
                num -= 55;
            } else num -= '0';
            answer += (int) (Math.pow(b, i) * num);
        }
        System.out.println(answer);
    }
}

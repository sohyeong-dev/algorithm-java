package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B9742_순열 {

    static int R;   // 배열의 크기
    static char[] arr = new char[10];   // 입력 문자열
    static int N;   // 순열 개수 카운트
    static char[] selected = new char[10];    // 현재 결과를 확인하기 위한 변수
    static boolean[] isSelected = new boolean[10];  // 마킹 배열

    static void permutation(int r) {

        // 종료 조건
        if (r == R) {
            N--;
            return;
        }

        // 다음 재귀 확장
        for (int i = 0; i < R; i++) {
            if (isSelected[i]) continue;    // 중복 허용 안함

            // 선택
            selected[r] = arr[i];
            isSelected[i] = true;
            permutation(r + 1);

            // 선택 해제
            isSelected[i] = false;
            if (N == 0) return;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String[] strings;
        StringBuilder builder = new StringBuilder();
        while (s != null && s.length() > 0) {
            builder.append(s);
            strings = s.split(" ");

            R = strings[0].length();
            for (int i = 0; i < R; i++) {
                arr[i] = strings[0].charAt(i);
            }

            N = Integer.parseInt(strings[1]);

            permutation(0);
            builder.append(" = ");
            if (N == 0) {
                for (int i = 0; i < R; i++) {
                    builder.append(selected[i]);
                }
                builder.append("\n");
            }
            else builder.append("No permutation\n");

            s = reader.readLine();
        }


        System.out.println(builder);
    }
}

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kb3반_알고리즘2번_이소형 {

    static int n;   // 숫자 개수
    static int m;   // 최대 숫자 합
    static int R = 3;   // 세 수
    static int[] nums;  // 주어진 숫자
    static int sum = 0; // 합
    static int result = 0;  // 가장 큰 수

    // 조합 재귀 함수 구현
    static void combination(int r, int idx) {

        // 종료 조건
        if (r == R) {
            if (sum <= m) {
                if (sum > result) result = sum;
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            sum += nums[i];
            combination(r + 1, i + 1);
            sum -= nums[i];
        }
    }

    /*
    6 96
    5 20 45 69 65 70
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split(" ");
        n = Integer.parseInt(strings[0]);
        m = Integer.parseInt(strings[1]);

        strings = reader.readLine().split(" ");
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        combination(0, 0);

        System.out.println(result);
    }
}

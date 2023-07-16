package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309_일곱난쟁이 {

    static int[] nums = new int[9];
    static int sum = 0;
    static int[] answer = new int[7];

    static void combination(int r, int idx) {

        if (r == 7) {
            if (sum == 100) {
                for (int e :
                        answer) {
                    System.out.println(e);
                }
                System.exit(0);
            }
            return;
        }

        for (int i = idx; i < 9; i++) {
            answer[r] = nums[i];
            sum += nums[i];
            combination(r + 1, i + 1);
            sum -= nums[i];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(nums);
        combination(0, 0);
    }
}

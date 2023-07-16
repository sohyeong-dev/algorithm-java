package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kb3반_알고리즘1번_이소형 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        int max, idx;
        for (int i = 0; i < n; i++) {
            max = nums[i];
            idx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    idx = j;
                }
            }
            System.out.println(max);
            nums[idx] = nums[i];
        }
    }
}

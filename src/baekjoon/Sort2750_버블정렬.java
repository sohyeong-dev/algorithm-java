package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort2750_버블정렬 {

    public void swap() {}

    public static void main(String[] args) throws IOException {

        Arrays.sort(new String[] {});

        Sort2750_버블정렬 ins = new Sort2750_버블정렬();
        ins.swap();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}

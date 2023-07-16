package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subset1182_부분수열의합 {

    static int n;
    static int s;
    static int[] nums;
    static int sum = 0;
    static int cnt = 0;
    static int selected = 0;

    static void subset(int idx) {

        if (idx == n) {
            if (selected < 1) return;
            if (sum == s) cnt++;
            return;
        }

        sum += nums[idx];
        selected++;
        subset(idx + 1);

        sum -= nums[idx];
        selected--;
        subset(idx + 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split(" ");
        n = Integer.parseInt(strings[0]);
        s = Integer.parseInt(strings[1]);

        nums = new int[n];
        strings = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        subset(0);
        System.out.println(cnt);
    }
}

package baekjoon;

import java.util.Scanner;

/**
 * 투 포인터
 */
public class B2018_수들의합 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] sums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + i;
        }

        int start = 1, end = 1, sum = 1, cnt = 0;
        while (start <= end && end <= n) {
            if (sum == n) cnt++;
            if (sum < n) sum += ++end;
            else sum -= start++;
        }

        System.out.println(cnt);
    }
}

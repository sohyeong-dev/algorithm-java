package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B10986_나머지합 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        strings = reader.readLine().split(" ");

        int[] sums = new int[n + 1];
        Long prev;
        Map<Integer, Long> mods = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sums[i + 1] += (sums[i] + Long.parseLong(strings[i])) % m;
            prev = mods.get(sums[i + 1]);
            if (prev == null) mods.put(sums[i + 1], 1L);
            else mods.put(sums[i + 1], prev + 1);
        }
        Long result = mods.get(0);
        if (result == null) result = 0L;
        for (long k :
                mods.values()) {
            result += k * (k - 1) / 2;
        }
        System.out.println(result);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays10807_개수세기 {

    public static void main(String[] args) throws IOException {

        /**
         * 입력
         * System.in - 외부 입력
         * 한줄씩 읽는다. - reader.readLine();  // String
         */
//        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
//        System.out.println(n);

        String[] strs = reader.readLine().split(" ");
//        System.out.println(Arrays.toString(strs));

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

//        System.out.println(Arrays.toString(nums));

        int v = Integer.parseInt(reader.readLine());
//        System.out.println(v);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == v) cnt++;
        }
        System.out.println(cnt);

//         */


        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        System.out.println(n);
        System.out.println(Arrays.toString(nums));
        System.out.println(v);

         */
    }
}

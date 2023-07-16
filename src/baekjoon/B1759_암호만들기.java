package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1759_암호만들기 {

    static int l;
    static int c;
    static char[] chars;
    static char[] selected;
    static int cnt1 = 0;
    static int cnt2 = 0;

    static void combination(int r, int idx) {

        if (r == l) {
            if (cnt1 >= 1 && cnt2 >= 2) {
                for (char e :
                        selected) {
                    System.out.print(e);
                }
                System.out.println();
            }
            return;
        }

        boolean is;
        for (int i = idx; i < c; i++) {
            selected[r] = chars[i];
            is = chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u';
            if (is) cnt1++;
            else cnt2++;

            combination(r + 1, i + 1);

            if (is) cnt1--;
            else cnt2--;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split(" ");
        l = Integer.parseInt(strings[0]);
        c = Integer.parseInt(strings[1]);

        chars = new char[c];
        strings = reader.readLine().split(" ");
        for (int i = 0; i < c; i++) {
            chars[i] = strings[i].charAt(0);
        }

        selected = new char[l];

        Arrays.sort(chars);
        combination(0, 0);
    }
}

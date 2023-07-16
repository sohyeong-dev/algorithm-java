package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2961_도영이 {

    static int n;
    static boolean[] isSelected;    // 탐색 마킹 배열
    static int[] sList;
    static int[] bList;
    static int result = 999999999;  // 최솟값 저장 (정답)
    static int temp;
    static int sSum = 1;    // 현재 신맛
    static int bSum = 0;    // 현재 쓴맛
    static int cnt = 0;

    // 부분 집합 탐색
    static void subset(int i) {

        // 종료 조건
        if (i == n) {
            if (cnt < 1) return;
            temp = Math.abs(sSum - bSum);
            if (temp < result) result = temp;
            return;
        }

        // 다음 재귀

        // 1. 현재 원소 선택 X
        if (isSelected[i]) {
            sSum /= sList[i];
            bSum -= bList[i];
            cnt--;
        }
        isSelected[i] = false;
        subset(i + 1);

        // 2. 현재 원소 선택
        if (!isSelected[i]) {
            sSum *= sList[i];
            bSum += bList[i];
            cnt++;
        }
        isSelected[i] = true;
        subset(i + 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        isSelected = new boolean[n];

        sList = new int[n];
        bList = new int[n];
        String[] strings;
        for (int i = 0; i < n; i++) {
            strings = reader.readLine().split(" ");

            sList[i] = Integer.parseInt(strings[0]);
            bList[i] = Integer.parseInt(strings[1]);
        }

        subset(0);
        System.out.println(result);
    }
}

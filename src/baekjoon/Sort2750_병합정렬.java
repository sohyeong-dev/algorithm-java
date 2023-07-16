package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort2750_병합정렬 {

    public static int[] arr;
    public static int[] temp;

    public static void mergeSort(int left, int right) {
        // 종료 조건
        if (left == right) return;

        int center = (left + right) / 2;    // 중앙

        // 확장
        mergeSort(left, center);    // 왼쪽
        mergeSort(center + 1, right);   // 오른쪽
//        int leftSize = l.length, rightSize = r.length;
//        int[] temp = new int[leftSize + rightSize];
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int leftIdx = left, rightIdx = center + 1, idx = left;
        for (; leftIdx <= center && rightIdx <= right; idx++) {
            if (temp[leftIdx] < temp[rightIdx]) arr[idx] = temp[leftIdx++];
            else arr[idx] = temp[rightIdx++];
        }
        for (; leftIdx <= center; leftIdx++) {
            arr[idx++] = temp[leftIdx];
        }
        for (; rightIdx <= right; rightIdx++) {
            arr[idx++] = temp[rightIdx];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        temp = new int[n];

        mergeSort(0, n - 1);

        for (int e :
                arr) {
            System.out.println(e);
        }
    }
}

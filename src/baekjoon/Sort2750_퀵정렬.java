package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort2750_퀵정렬 {

    public static int[] arr;

    public static int partition(int left, int right) {

        int temp, idx = left;
        int pivot = arr[left++];

        while (left <= right) { // 엇갈리기 직전까지 움직인다
            for (; left <= right && arr[left] <= pivot; left++) {
                // left 전진 => pivot 보다 큰 값을 찾기 위함
            }
            for (; left <= right && arr[right] >= pivot; right--) {
                // right 전진 => pivot 보다 작은 값을 찾기 위함
            }

            if (left < right) { // 엇갈리지 않은 경우
                // swap
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            // 엇갈린 경우 = 탐색 종료
        }

        // pivot <-> right
        arr[idx] = arr[right];
        arr[right] = pivot;
        return right;
    }

    public static void quickSort(int left, int right) {

        // 1. 종료 조건 - 배열이 없거나 값이 1개인 경우
        if (left >= right) return;

        int pivot = partition(left, right);

        // 2. 확장
        quickSort(left, pivot - 1);
        quickSort(pivot + 1, right);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        quickSort(0, n - 1);

        for (int e :
                arr) {
            System.out.println(e);
        }
    }
}

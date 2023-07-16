package day1;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        System.out.println("안녕하세요");

        // int 타입 배열 생성
        int[] arr = new int[4];

        // 배열 출력
        System.out.println(arr);

        // Arrays.toString(배열) - 배열 값 출력
        System.out.println(Arrays.toString(arr));


        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        // 배열 값을 원하는 값으로 초기화 - 메모리를 다시 할당
        arr = new int [] { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(배열) - 오름차순 정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Arrays.copyOfRange(배열, 시작 인덱스, 끝 인덱스) - slicing
        int [] copyArr = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr));

        int [][] arr2d = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println(Arrays.toString(arr2d));

        // 2차원 배열 - for 문으로 출력
        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }

        System.out.println(Arrays.deepToString(arr2d));
    }
}

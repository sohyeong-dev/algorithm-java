package day4;

public class PermutationTest {

    static char[] arr;
    static int N;
    static int R;
    static char[] select;

    static boolean[] isSelected;

    // 순열
    public static void permutation(int r) {

        // 종료 조건
        if (r == R) {
            for (int i = 0; i < R; i++) {
                System.out.print(select[i]);
            }
            System.out.println();
            return;
        }

        // 재귀 확장
        for (int i = 0; i < N; i++) {
            // 선택한 경우 = skip
            if (isSelected[i]) continue;

            // 선택
            select[r] = arr[i];
            isSelected[i] = true;
            permutation(r + 1);

            // 선택 해제
            isSelected[i] = false;
        }
    }

    // 중복 순열
    public static void dup_permutation(int r) {

        // 종료 조건
        if (r == R) {
            for (int i = 0; i < R; i++) {
                System.out.print(select[i]);
            }
            System.out.println();
            return;
        }

        // 재귀 확장
        for (int i = 0; i < arr.length; i++) {
            select[r] = arr[i];
            dup_permutation(r + 1);
        }
    }

    public static void main(String[] args) {

        arr = new char[] {'A', 'B', 'C', 'D'};
        N = 4;
        R = 2;

        select = new char[R];
        isSelected = new boolean[N];

        dup_permutation(0);

        System.out.println("==========");

        permutation(0);
    }
}

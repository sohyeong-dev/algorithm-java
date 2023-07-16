package day4;

public class CombinationTest {

    static char[] arr;
    static int N;   // 전체 문자열 개수
    static int R;   // 선택 개수

    static char[] select;    // 선택 저장 변수 - 출력용
    static boolean[] isSelected;    // 마킹 배열 - 중복 허용 안함

    public static void combination(int size, int idx) {

        // 종료 조건
        if (size == R) {
            for (int i = 0; i < size; i++) {
                System.out.print(select[i]);
            }
            System.out.println();
            return;
        }

        // 재귀 확장
        for (int i = idx; i < N; i++) {
            if (isSelected[i]) continue;

            select[size] = arr[i];
            isSelected[i] = true;
            combination(size + 1, i + 1);

            isSelected[i] = false;
        }
    }

    public static void main(String[] args) {

        // 초기화 //
        arr = new char[] {'A', 'B', 'C', 'D'};
        N = arr.length;
        R = 2;
        select = new char[R];
        isSelected = new boolean[N];

        // 조합 실행 //
        combination(0, 0);
    }
}

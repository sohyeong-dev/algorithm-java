package day1;

public class Test {

    public static void main(String[] args) {

        int n = 987654321;

        long start , end ;
        start = System.currentTimeMillis();     // 시작 시간

// 반복문 (여러 시간복잡도와 N 을 설정해서 테스트 해보세요) //

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }

        end = System.currentTimeMillis();        // 종료 시간
        System.out.println("반복문 실행시간(ms) : " + (end - start));


        start = System.currentTimeMillis();     // 시작 시간

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt += i;
            }
        }

        end = System.currentTimeMillis();        // 종료 시간
        System.out.println("반복문 실행시간(ms) : " + (end - start));

        start = System.currentTimeMillis();     // 시작 시간

        for (int i = 0; i < Math.log(n); i++) {
            //
        }

        end = System.currentTimeMillis();        // 종료 시간
        System.out.println("반복문 실행시간(ms) : " + (end - start));

    }
}

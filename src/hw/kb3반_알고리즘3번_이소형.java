package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kb3반_알고리즘3번_이소형 {

    static int[][] map = new int[21][21];   // 바둑판
    /*
    검은 바둑알 = 1
    흰 바둑알 = 2
    아직 놓이지 않은 자리 = 0
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings;
        for (int i = 1; i <= 19; i++) {
            strings = reader.readLine().split(" ");
            for (int j = 1; j <= 19; j++) {
                map[i][j] = Integer.parseInt(strings[j - 1]);
            }
        }

        /* 방향
        1) 가로
        2) 세로
        3) 대각선 위
        4) 대각선 아래
         */
        int[] dr = {0, 1, -1, 1};
        int[] dc = {1, 0, 1, 1};
        int n = dr.length, cnt, nr, nc;

        // 2중 루프
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                if (map[i][j] == 0) continue;

                // 4개의 방향에 대해서 검사
                for (int k = 0; k < n; k++) {
                    // 가장 왼쪽 위 //
                    if (map[i - dr[k]][j - dc[k]] == map[i][j]) continue;

                    cnt = 1;
                    nr = i + dr[k]; nc = j + dc[k];
                    while (map[nr][nc] == map[i][j] && cnt < 6) {   // 6알 이상이 연속으로 놓인 경우 이긴 것이 아님
                        cnt++;
                        nr += dr[k]; nc += dc[k];
                    }

                    if (cnt == 5) { // 연속으로 5개
                        System.out.println(map[i][j]);
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }

        // 승부가 나지 않았을 경우
        System.out.println(0);
    }
}

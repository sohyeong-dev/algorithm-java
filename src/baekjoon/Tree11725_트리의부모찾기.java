package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree11725_트리의부모찾기 {

    static ArrayList<Integer>[] tree;
    static boolean[] isVisited;
    static int[] parents;

    static void findParent(int n) {
        if (tree[n].size() == 0 || isVisited[n]) {
            return;
        }

        isVisited[n] = true;

        for (int i:
             tree[n]) {
            if (isVisited[i]) continue;

            parents[i] = n;
            findParent(i);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        String[] strings;
        int a, b;
        for (int i = 0; i < n - 1; i++) {
            strings = reader.readLine().split(" ");
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[1]);
            tree[a].add(b);
            tree[b].add(a);
        }

        isVisited = new boolean[n + 1];
        parents = new int[n + 1];

        findParent(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree1068_트리 {

    static List<Integer>[] children;
    static int d;
    static int cnt = 0;

    static void findLeaf(int v) {
        if (v == d) return;

        if (children[v].size() == 0) {
            cnt++;
            return;
        }

        for (int e :
                children[v]) {
            findLeaf(e);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        children = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }
        String[] strings = reader.readLine().split(" ");
        int v, root = 0;
        for (int i = 0; i < n; i++) {
            v = Integer.parseInt(strings[i]);
            if (v == -1) {
                root = i;
                continue;
            }
            children[v].add(i);
        }

        d = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            children[i].remove(Integer.valueOf(d));
        }

        findLeaf(root);
        System.out.println(cnt);
    }
}

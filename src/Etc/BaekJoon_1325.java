package Etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1325 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(b).add(a);
        }

        int maxCount = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int count = bfs(i);

            if (count > maxCount) {
                maxCount = count;
                result.clear();
                result.add(i);
            } else if (count == maxCount) {
                result.add(i);
            }
        }

        for (int comp : result) {
            System.out.print(comp + " ");
        }
    }

    public static int bfs(int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }

        return count;
    }
}

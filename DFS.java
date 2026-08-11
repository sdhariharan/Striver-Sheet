import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public static void dfs(int start, ArrayList<ArrayList<Integer>> graph) {

        int n = graph.size();

        boolean[] visited = new boolean[n];

        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (visited[node]) {
                continue;
            }

            visited[node] = true;

            System.out.println(node);

            for (int neighbour : graph.get(node)) {

                if (!visited[neighbour]) {
                    stack.push(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);
        graph.get(2).add(5);

        graph.get(3).add(1);

        graph.get(4).add(1);

        graph.get(5).add(2);

        dfs(0, graph);
    }
}
import java.util.*;
public class TopologicalSorting {
    public List<Integer> topologicalSort(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
            inDegree[edge[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int neighbor : graph.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }

        return result.size() == numCourses ? result : new ArrayList<>();
    }
}

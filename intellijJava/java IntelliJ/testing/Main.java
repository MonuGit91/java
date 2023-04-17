package testing;

import java.util.*;

public class Main {
    static int n;
    static int m;
    static List<Edge>[] adjList;
    static boolean[] visited;
    static PriorityQueue<Edge> minHeap;
    static long totalReward;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        // Initialize the adjacency list
        adjList = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        // Read in the edges and build the adjacency list
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (c == 0) {
                continue; // Edge has no reward or fine, so skip it
            }
            adjList[a].add(new Edge(b, c));
            adjList[b].add(new Edge(a, c));
            totalReward += c; // Add the reward to the total reward
        }

        // Find the minimum spanning tree of the graph using Prim's algorithm
        visited = new boolean[n+1];
        minHeap = new PriorityQueue<>();
        visit(1); // Start with vertex 1
        while (!minHeap.isEmpty()) {
            Edge edge = minHeap.poll();
            if (visited[edge.to]) {
                continue; // Already visited this vertex, so skip this edge
            }
            visit(edge.to);
            totalReward -= edge.weight; // Subtract the weight of the edge from the total reward
        }

        // Print the maximum reward
        System.out.println(totalReward);
    }

    static void visit(int v) {
        visited[v] = true;
        for (Edge edge : adjList[v]) {
            if (!visited[edge.to]) {
                minHeap.offer(edge);
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return Integer.compare(weight, other.weight);
        }
    }
}

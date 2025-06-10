package project1;

import java.util.*;

public class Graph {
    private Map<String, List<String>> graph = new HashMap<>();

    // Method to add connections (edges)
    public void addConnection(String zone, String... connectedZones) {
        graph.putIfAbsent(zone, new ArrayList<>());
        for (String connected : connectedZones) {
            graph.get(zone).add(connected);
        }
    }

    // Print the graph
    public void printGraph() {
        for (String zone : graph.keySet()) {
            System.out.println(zone + " connects to: " + graph.get(zone));
        }
    }

    // Depth-First Search traversal
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        System.out.println("\nDFS Traversal from " + start + ":");
        dfsUtil(start, visited);
    }

    private void dfsUtil(String current, Set<String> visited) {
        if (visited.contains(current)) return;
        System.out.println(current);
        visited.add(current);
        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            dfsUtil(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        Graph zoo = new Graph();

        // Creating graph based on your image
        zoo.addConnection("Entrance", "Reptile House", "Bird Sanctuary", "Mammal Zone");
        zoo.addConnection("Reptile House", "Snake Pit");
        zoo.addConnection("Bird Sanctuary", "Parrot Pavilion");
        zoo.addConnection("Mammal Zone", "Lion Den", "Elephant Enclosure");

        // Print the graph structure
        zoo.printGraph();

        // Optional: Perform DFS from Entrance
        zoo.dfs("Entrance");
    }
}


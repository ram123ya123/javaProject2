package project1;


		// TODO Auto-generated method stub


import java.util.*;

public class SocialClassDFS {

    // Adjacency list to represent graph
    private Map<String, List<String>> graph = new HashMap<>();

    // Add a friendship connection
    public void addConnection(String person1, String person2) {
        graph.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        graph.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }

    // Recursive DFS
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfsRecursive(person, visited, result);
        return result;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> result) {
        if (!visited.contains(person)) {
            visited.add(person);
            result.add(person);
            for (String neighbor : graph.getOrDefault(person, new ArrayList<>())) {
                dfsRecursive(neighbor, visited, result);
            }
        }
    }


public List<String> findSocialClassIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                    stack.push(neighbor);
                }
            }
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        SocialClassDFS sc = new SocialClassDFS();

        // Sample graph
        sc.addConnection("Alice", "Bob");
        sc.addConnection("Bob", "Charlie");
        sc.addConnection("David", "Eve");

        System.out.println("Recursive DFS: " + sc.findSocialCircle("Alice"));
        System.out.println("Iterative DFS: " + sc.findSocialClassIterative("Alice"));
    }
}

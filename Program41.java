package project1;
import java.util.LinkedList;
import java.util.Stack;

import java.util.*;

public class Program41 {
    public static void main(String[] args) {
        // Stack Example - Toy Box (LIFO)
        Stack<String> toyBox = new Stack<>();
        toyBox.push("Ball");
        toyBox.push("Blocks");
        toyBox.push("Puzzle");

        // Take out (pop) the top toy and show it
        String playingToy = toyBox.pop();
        System.out.println("Toy being played with: " + playingToy);

        // Show remaining toys
        System.out.println("Remaining toys in the toy box: " + toyBox);

        System.out.println();

        // Queue Example - Ice Cream Line (FIFO)
        Queue<String> iceCreamLine = new LinkedList<>();
        iceCreamLine.add("Maya");
        iceCreamLine.add("Leo");
        iceCreamLine.add("Nina");

        // Serve the first kid
        String servedKid = iceCreamLine.poll();
        System.out.println("Kid being served: " + servedKid);

        // Show remaining kids in line
        System.out.println("Kids still in line: " + iceCreamLine);
    }
}

	
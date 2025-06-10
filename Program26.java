package project1;
import java.util.HashMap;

public class Program26 {
    public static void main(String[] args) {
        HashMap<String, Integer> arr = new HashMap<>();
        arr.put("ramya", 1);
        arr.put("kalavathi", 2);
        arr.put("redu", 3);
        arr.put("manoj", 4);
        arr.put("bhargav", 5);

        arr.remove("ramya", 1);
        arr.remove("bhargav");
        arr.put("manoj yadav",4);

        if (arr.containsKey("redu")) {
            System.out.println("Key 'redu' exists");
        } else {
            System.out.println("Key 'redu' does not exist");
        }

        System.out.println(arr);
    }
}

package project1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}



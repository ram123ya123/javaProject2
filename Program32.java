package project1;

import java.util.*;

public class Program32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  // Read the size of the array

        int[] a = new int[n];    // Create an array of size n

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();  // Read each element and store it in the array
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);  // This part is often locked by HackerRank
        }
    }
}


package project1;

import java.util.Scanner;
        import java.util.Arrays;

        public class Specified {
            public static void main(String[] args) {
                int[] arr = {5, 10, 15, 20, 25, 30, 35};
                Arrays.sort(arr); // Binary search works on sorted array

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the element to search: ");
                int key = sc.nextInt();

                int result = binarySearch(arr, key);
                if (result == -1)
                    System.out.println("Element not found.");
                else
                    System.out.println("Element found at index: " + result);
            }

            static int binarySearch(int[] arr, int key) {
                int low = 0, high = arr.length - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (arr[mid] == key)
                        return mid;
                    else if (arr[mid] < key)
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
                return -1;
            }
        }




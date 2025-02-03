// EvenOddArrays.java

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArrays {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

        scanner.close();
    }
}
//SmallestDistance.java

public class SmallestDistance {
    public static int findSmallestDistanceIndex(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int minIndex = 0;
        int minDiff = Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 32, 13, 2};
        int index = findSmallestDistanceIndex(arr);
        System.out.println("Index of the first number in the smallest difference pair: " + index);
    }
}

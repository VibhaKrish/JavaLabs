package lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	public static int[] getSorted(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return arr;
        }

        // Reverse the numbers in the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Sort the reversed array
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] sortedArr = getSorted(arr);

        System.out.println("Sorted array with reversed elements:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

}

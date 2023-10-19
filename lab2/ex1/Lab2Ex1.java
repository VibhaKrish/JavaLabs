package lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {
	public static int getSecondSmallest(int[] arr) {
        // check if the array has at least two elements
        if (arr.length < 2) {
            throw new IllegalArgumentException("Min array length has to be 2");
        }

        // sort in ascending order
        Arrays.sort(arr);

        // return the second element 
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 4, 6, 2};
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);
    }

}

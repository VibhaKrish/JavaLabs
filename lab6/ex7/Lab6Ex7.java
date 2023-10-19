package lab6.ex7;

import java.util.Arrays;

public class Lab6Ex7 {
	 public static void main(String[] args) {
	        int[] originalArray = {5, 3, 9, 1, 7};
	        int[] reversedSortedArray = reverseAndSort(originalArray);

	        System.out.println("Reversed and Sorted Array: " + Arrays.toString(reversedSortedArray));
	    }

	    public static int[] reverseAndSort(int[] originalArray) {
	        int[] reversedArray = new int[originalArray.length];

	        for (int i = 0; i < originalArray.length; i++) {
	            reversedArray[i] = originalArray[originalArray.length - 1 - i];
	        }
	        
	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.println("Reversed Array ->"+Arrays.toString(reversedArray));

	        Arrays.sort(reversedArray);

	        return reversedArray;
	    }



}

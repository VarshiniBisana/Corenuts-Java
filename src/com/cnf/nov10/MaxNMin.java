package com.cnf.nov10;

public class MaxNMin {
public static void main(String[] args) {
	
	        int[] numbers = {54, 42, 39, 61, 47, 53, 78};

	        int minValue = findMinValue(numbers);
	        int maxValue = findMaxValue(numbers);

	        System.out.println("Minimum Value: " + minValue);
	        System.out.println("Maximum Value: " + maxValue);
	    }

	    // Function to find the minimum value in an array
	    public static int findMinValue(int[] arr) {
	        int min = arr[0];
	        for (int num = 1; num < arr.length; num++) {
	            if (arr[num] < min) {
	                min = arr[num];
	            }
	        }
	        return min;
	    }

	    // Function to find the maximum value in an array
	    public static int findMaxValue(int[] arr) {
	        int max = arr[0];
	        for (int num2 = 1; num2 < arr.length; num2++) {
	            if (arr[num2] > max) {
	                max = arr[num2];
	            }
	        }
	        return max;
	    }
}

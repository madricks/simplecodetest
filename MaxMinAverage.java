package com.achmadricky.simplecodetest;

import java.util.stream.IntStream;

public class MaxMinAverage {

	public static void main(String []args){
		
		int[] intArray = new int[]{ 24, 14, 94, 83, 46 }; 
		
        int max = nativeMax(intArray);
        int min = nativeMin(intArray);
        float average = nativeAverage(intArray);
        
        System.out.println("Using native method (my version):");
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + average);
        
        System.out.println("---");
        
        System.out.println("Using built in Java-8 method:");
        System.out.println("max: " + IntStream.of(intArray).max().getAsInt());
        System.out.println("min: " + IntStream.of(intArray).min().getAsInt());
        System.out.println("average: " + IntStream.of(intArray).average().getAsDouble());
    }
	
	/**
	 * Native method to get maximum value from a list
	 */
	public static int nativeMax(int[] arr) {
		
		int max = arr.length > 0 ? arr[0] : 0;
		
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	/**
	 * Native method to get minimum value from a list
	 */
	public static int nativeMin(int[] arr) {
		
		int min = arr.length > 0 ? arr[0] : 0;
		
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	/**
	 * Native method to get average from a list
	 */
	public static float nativeAverage(int[] arr) {

		int n = arr.length;
		int sum = 0;
		float average = 0;

		for (int i : arr) {
			sum += i;
		}

		average = (float)sum / n;

		return average;
	}
}

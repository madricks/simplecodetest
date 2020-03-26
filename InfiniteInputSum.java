package com.achmadricky.simplecodetest;

import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteInputSum {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide list of number: ");
        while (true) {
        	String input = sc.next();
        	if (input.equals("=")) {
        		break;
        	}
        	numbers.add(Integer.parseInt(input));
        }
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
	}
}

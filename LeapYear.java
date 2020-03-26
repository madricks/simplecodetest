package com.achmadricky.simplecodetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeapYear {
	
	public static void main(String []args){
		
		String firstYear, secondYear = ""; // Objects of String class
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Enter first year");
	    firstYear = in.nextLine();
	    
	    System.out.println("Enter second year");
	    secondYear = in.nextLine();
	    
	    System.out.println("List of leap years between " + firstYear + " and " + secondYear + ": ");
	    System.out.println(getListLeapYears(firstYear, secondYear));
    }
	
	public static List<Integer> getListLeapYears(String firstYear, String secondYear) {
		
		List<Integer> leapYears = new ArrayList<Integer>();
		
		IntStream.rangeClosed(Integer.parseInt(firstYear), Integer.parseInt(secondYear)).forEach(year -> {
			if (year % 4 == 0) {
				leapYears.add(year);
			}
		});
		
		return leapYears;
	}
}

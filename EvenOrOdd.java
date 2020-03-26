package com.achmadricky.simplecodetest;

public class EvenOrOdd {
	
	public static void main(String []args){
		
        String myGrade = amIEvenOrOdd(1);
        System.out.println(myGrade);
    }

	public static String amIEvenOrOdd(int value) {
        
        if ( value % 2 == 0 ) {
            return "Even";
        } else {
        	return "Odd";
        }
	}
}

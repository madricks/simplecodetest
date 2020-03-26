package com.achmadricky.simplecodetest;

public class WhatIsMyGrade {
	
	public static void main(String []args){
		
        String myGrade = whatIsMyGrade(2);
        System.out.println(myGrade);
    }

	public static String whatIsMyGrade(int value) {
        
        if ( value >= 90 ) {
            return "A";
        } else if ( value >=80 && value <=89 ) {
            return "B";
        } else if ( value >=70 && value <=79 ) {
            return "C";
        } else if ( value >=60 && value <=69 ) {
            return "D";
        } else {
            return "E";
        }
    }
}

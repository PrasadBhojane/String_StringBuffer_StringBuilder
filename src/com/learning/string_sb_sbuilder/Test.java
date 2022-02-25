package com.learning.string_sb_sbuilder;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		if(sb.equals(s)) { //in stringbuffer object class equals method which is meant for reference comparison returns false
			System.out.println("Match1");
		}
		else if(sb.toString().equals(s.toString())) {//by calling toString method we are calling equals method which meant for content comparison returns true
			System.out.println("Match2");
		}
		else {
			System.out.println("No match");
		}
	}
}

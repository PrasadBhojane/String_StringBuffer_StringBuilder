package com.learning.string_sb_sbuilder;

public class LearnEqualOperator {

	public static void main(String[] args) {
		
		String s1 = new String("Prasad");
		String s2 = new String("Prasad");
		System.out.println(s1==s2);       //false
		System.out.println(s1.equals(s2));//true //in String .equals() method will be overridden and in string it is meant for Content comparison
		
		
		StringBuffer sb1 = new StringBuffer("Prasad");
		StringBuffer sb2 = new StringBuffer("Prasad");
		System.out.println(sb1==sb2);     //false
		System.out.println(sb1.equals(sb2));//false //Object class .equals() method will be called which is meant for Reference comparison.
	}
}

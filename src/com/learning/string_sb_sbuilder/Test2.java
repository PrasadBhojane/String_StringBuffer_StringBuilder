package com.learning.string_sb_sbuilder;

public class Test2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Prasad");
		String str1 = sb1.toString();
		String str2 = str1;  //------Line-1
		System.out.println(str1 == str2);
	}
}

/*	
 * which code fragment, when inserted at line-1, enables the code to print true?
 * A. String str2=str1; 
 * B. String str2 = new String(str1); 
 * C. String str2 = sb1.toString(); 
 * D. String str2 = "Durga";
 * 
 * Answer = A
 * 
 */

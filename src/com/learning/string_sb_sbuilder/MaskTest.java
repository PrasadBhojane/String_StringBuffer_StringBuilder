package com.learning.string_sb_sbuilder;

public class MaskTest {

	public static String mask(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		return x+creditCard.substring(15,19);//....LINE-1
		
//		OR METHOD TO LINE-1:-
//		StringBuilder sb = new StringBuilder(x);
//		sb.append(creditCard,15,19);
//		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(mask("1234-5678-9876-5432"));
	}
}
//class to display last 4 digits of credit card no.
//Durga vid on string.
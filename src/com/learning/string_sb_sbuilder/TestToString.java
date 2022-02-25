package com.learning.string_sb_sbuilder;

class MyString{
	
	String msg;
	
	MyString (String msg){
		this.msg=msg;
	}
	public String toString() { //....Line-1 //MyString class overriding toString method to
		return msg;
	}
}

public class TestToString {

	public static void main(String[] args) {
		//In String & StringBuffer & StringBuilder class - toString Method already overridden.
		System.out.println("Hello "+ new StringBuilder("Java SE 8")); 
		
		//If we didn't override toString method in MyString class and commented line-1, 
		//instead of msg-'Java SE 8' @Hashcode will be printed on console.
		System.out.println("Hello "+ new MyString("Java SE 8")); 
	}	
}

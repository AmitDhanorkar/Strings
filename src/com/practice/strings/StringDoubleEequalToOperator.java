package com.practice.strings;

public class StringDoubleEequalToOperator {

	public static void main(String[] args) {
		/*  == Operator :
		    * It is comparing reference type and it returns Boolean value as a return value.
		    * If two reference variables are pointing to same object  then it returns True, otherwise False.
		*/

		StringDoubleEequalToOperator t1 = new StringDoubleEequalToOperator();
		StringDoubleEequalToOperator t2 = new StringDoubleEequalToOperator();
		StringDoubleEequalToOperator t3 = t2;
		System.out.println("t1 == t2 : "+ (t1==t2));
		System.out.println("t2 == t3 : "+ (t2==t3));
		
		String str1 = "Amit";
		String str2 = "Amit";
		System.out.println("str1 == str2 : "+ (str1==str2));
		
		String str3 = new String("Monali");
		String str4 = new String("Monali");
		System.out.println("str3 == str4 : "+ (str3==str4));
		
		StringBuffer sb1 = new StringBuffer("simplilearn");
		StringBuffer sb2 = new StringBuffer("simplilearn");
		System.out.println("sb1 == sb2 : "+ (sb1==sb2));
	}

}

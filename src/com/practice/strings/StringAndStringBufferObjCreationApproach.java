package com.practice.strings;

public class StringAndStringBufferObjCreationApproach {

	public static void main(String[] args) {
		
		/* two approaches to create String object */
		
		String str = "Amit"; //without using new operator
		System.out.println(str);
		String str1 = new String("Monali"); //with using new operator
		System.out.println(str1);
		
		/* one approach to create StringBuffer object(by using new operator)*/
		StringBuffer sb = new StringBuffer("Simplilearn");
		System.out.println(sb);

	}

}

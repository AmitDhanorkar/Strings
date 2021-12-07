package com.practice.strings;

public class StringImmutableVsStringBufferMutable {

	public static void main(String[] args) {
		// immutability class(modification on existing content not allowed)
		String str = "Amit";
		str.concat("Dhanorkar");
		System.out.println(str);
		
		//mutability class(modification on existing content possible)
		StringBuffer sb = new StringBuffer("Monali");
		sb.append("Dhanorkar");
		System.out.println(sb);

	}

}

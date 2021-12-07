package com.practice.strings;

public class StringRepresentation {

	public static void main(String[] args) {

		String str = "Amit";
		System.out.println(str);
		
		String str1 = new String("Amit");
		System.out.println(str1);
		
		char[]  ch = {'A','M','I','T'};
		String str3 = new String(ch);
		System.out.println(str3);
		
		char[] ch1 = {'A','M','I','T','B','D','H','A'};
		String str4 = new String(ch1,1,5);
		System.out.println(str4);
		
		byte[] b = {65,66,67,68,69};
		String str5 = new String(b);
		System.out.println(str5);
		
		byte[] b1 = {65,66,67,68,69,70};
		String str6 = new String(b1,1,5);
		System.out.println(str6);
	}

}

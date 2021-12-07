package com.practice.strings;

public class StringAndStringbufferEqualMethod {

	public StringAndStringbufferEqualMethod(String str) {

	}
	public static void main(String[] args) {
		
		StringAndStringbufferEqualMethod t1 = new StringAndStringbufferEqualMethod("amit");
		StringAndStringbufferEqualMethod t2 = new StringAndStringbufferEqualMethod("amit");
		//Object class equals() method executed(reference comparison)
		System.out.println("t1.equals(t2) : "+ t1.equals(t2));
		
		String str1 = new String("monali");
		String str2 = new String("monali");
		//String class equals() method executed(content comparison)
		System.out.println("str1.equals(str2) : "+ str1.equals(str2));
		
		StringBuffer sb1 = new StringBuffer("dhanorkar");
		StringBuffer sb2 = new StringBuffer("dhanorkar");
		//StringBuffer class equals() method executed(reference comparison)
		System.out.println("sb1.equals(sb2) : "+ sb1.equals(sb2));
	}

}

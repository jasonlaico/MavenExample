package com.first;

public class StringOperation {
	public String concat(String a, String b)
	{
		return a.concat(b);
	}
	public int Length(String a)
	{
		return a.length();
	}
	public boolean Contains(String a, String b)
	{
		return a.contains(b);
	}

	public static void main(String[] args) {
		StringOperation so= new StringOperation();
		System.out.println("Concat:\t"+so.concat("5","5"));
		System.out.println("Length:\t"+so.Length("helloworld"));
		System.out.println("Contains:\t"+so.Contains("break","b"));
		System.out.println("End");
		
	}

}

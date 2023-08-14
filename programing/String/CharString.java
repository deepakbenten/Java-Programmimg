package com.programing.String;

public class CharString 
{
	void meth1()
	{
		String s1="java";
		String s2=new String("java");
		
		char arr[]= {'j','a','v','a'};
		String s3=new String(arr);
		
		String s4=new String(arr,1,3);
		
		System.out.println("s3 : " +s3);
		System.out.println("s4 : " +s4);
	}
	void meth2()
	{
		String s="Java";
		System.out.println(s);
		System.out.println(s.concat(" is awesome..!"));
	}
	void meth3()
	{
		String s1="Java is awesome ";
		byte b1[]=s1.getBytes();
		for(byte b : b1)
		{
			System.out.print((char)b+" ");
		}
	}
	public static void main(String[] args) {
		CharString obj=new CharString();
		//obj.meth1();
		//obj.meth2();
		
		obj.meth3();
	}
}

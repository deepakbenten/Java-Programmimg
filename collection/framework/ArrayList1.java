package com.collection.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add("java");
		//al.add('a');
		al.add(null);
		al.add(20);
		al.add(30);
		al.add(10);
		
		System.out.println(al);
		System.out.println("size of : "+al.size());
		System.out.println("get of "+al.get(2));
		System.out.println("index of :"+al.indexOf(al));
		System.out.println("remove : "+al.remove(2));
		System.out.println(al+" ");
		System.out.println(al.add(25));
		System.out.println(al);
		System.out.println("----------------------------------");
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		for(int i=al.size()-1; i>=0; i-- )
		{
			System.out.print(al.get(i) +" ");
		}
		System.out.println();
		System.out.println("empty : "+al.isEmpty());
		System.out.println("contains :"+al.contains(20));
		al.add(1,100);
		//al.clear();
		System.out.println(al);
		al.set(3, 500);
		System.out.println(al);
		Iterator li=al.iterator();
		while(li.hasNext())
		{
			System.out.print(li.next() +" ");
		}
	}
	public static void main(String[] args) {
		ArrayList1 al=new ArrayList1();
		al.meth1();
	}

}

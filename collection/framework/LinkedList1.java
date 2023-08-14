package com.collection.framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	void LinkedElement()
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Apple");
		list.add(null);
		list.add(1, "Orange");
		list.add(2,"Banana");
		list.add("graps");
		
		System.out.println(list);
		System.out.println("----------------------------------------");
		Iterator it=list.iterator();
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		System.out.println("----------------------------------------");
		Iterator i=list.iterator();
		{
			for(String s : list)
			{
				System.out.println(s);
			}
		}
		System.out.println("function start------------->");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println("----ListIterator-->");
		
		ListIterator li=list.listIterator();
		while(li.hasPrevious())
		{
			/* System.out.println(li.next()+" "); */
			
			  System.out.println("----previous-----"); 
			  System.out.println(li.previous()+" ");
			 
		}
		System.out.println("remove :"+list.remove(2));
		System.out.println(list);
		
	}
	public static void main(String[] args) {
		LinkedList1 obj = new LinkedList1();
		obj.LinkedElement();
	}

}

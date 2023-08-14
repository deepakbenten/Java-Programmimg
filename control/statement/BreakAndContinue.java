package com.control.statement;

public class BreakAndContinue 
{
	void breaks()
	{
		int a=10;
	
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				
				break;
			}
			System.out.print(i+" ");
		}
	}
	void continues()
	{
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		BreakAndContinue bc=new BreakAndContinue();
		//bc.breaks();
		bc.continues();
	}

}

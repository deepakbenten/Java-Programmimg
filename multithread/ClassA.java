package com.multithread;

public class ClassA 
{
	int amount=10000;
	synchronized void with_Draw(int amount) throws InterruptedException
	{
		if(this.amount<amount) 
		{
			System.out.println("Insufficient Balance !!");
			wait(10000);
			System.out.println("Amount Creadited !!");
			this.amount-=amount;
			System.out.println("With doaw successfully \n Balance is :" +this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("with draw successfully \n Balance is :"+this.amount);
		}
	}
	
	synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Deposited Succefully\n Balance is :" +this.amount);
	}

}

package com.company;

public class PerfectSquares 
{
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			int squares=i*i;
			if(squares>100) {
				break;
			}
			System.out.print(squares+ " , ");
		}
	}

}

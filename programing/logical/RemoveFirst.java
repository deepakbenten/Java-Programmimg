package com.programing.logical;

import java.util.Scanner;

public class RemoveFirst 
{
	public static int removeLeadingZeros(String input) {
	      int i = 0;
	      while (i < input.length() && input.charAt(i) == '0') {
	         i++;
	      }
	      if (i == input.length()) {
	         return 0; 
	      }
	      String substring = input.substring(i);
	      return Integer.parseInt(substring);
	   }
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a number : ");
	      String input = scanner.nextLine();
	      int output = removeLeadingZeros(input);
	      System.out.println("Output: " + output);
	   }

	   
}

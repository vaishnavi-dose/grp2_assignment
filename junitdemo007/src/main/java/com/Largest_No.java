package com;

import java.util.Scanner;

public class Largest_No 
{
	int checkLargest(int range1, int range2 )  
	{
		if(range1 > range2)
		{
			return range1;
		}
		return range2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_No ln = new Largest_No();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Range :");
		int r1= sc.nextInt();
		
		System.out.println("Enter Second Range :");
		int r2= sc.nextInt();
		
		int ans = ln.checkLargest(r1, r2);
		System.out.println("Maximum number is:" +ans);
		
		// Using Lambda Function 
		Largest_Num ln1 = (n1, n2)->
		{
			if(n1 > n2)
				return n1;
			return n2;
		};
		int ans2 = ln1.LargestNo(1,1000);
		System.out.println("Lambda Output:" +ans2);
		
	}
}

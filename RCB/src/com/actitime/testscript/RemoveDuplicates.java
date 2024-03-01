package com.actitime.testscript;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

//	public static void duplicates(int[]a) {
//		TreeSet<Integer> set= new TreeSet<>();
//		for(int i=0 ; i<a.length; i++)
//		{
//			set.add(a[i]);
//
//		}
//		System.out.println(set);
//	}
//
//	public static void main(String[] args) {
//		int [] a= {5,2,6,8,6,7,5,2,8};
//		duplicates(a);
//
//	}
	
	public static void main(String[] args) {
		
//		int [] a = {1,2,1,2,3,4};
//		
//		TreeSet<Integer> t= new TreeSet<Integer>();
//		for(int i=0 ; i<a.length; i++)
//			{
//				t.add(a[i]);
//	
//			}
//			System.out.println(t);
		// occurance
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character to check ");
		char ch= sc.next().charAt(0);
		int count =0;
		String s= "Allthebest";
		s= s.toUpperCase();
		char [] c= s.toCharArray();
		for(int i=0; i<c.length;i++)
		{
			if(c[i]==ch)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println(ch+" is present");
		}
		else
		{
			System.out.println(ch+" is not present");
		}
		}
	}



package com.actitime.testscript;

public class CharbyChar {
public static void main(String[] args) {
	String s= "All the Best";
	String[] s1 = s.split(" ");
	String res="";
	for(int i=0; i<s1.length; i++)
	{
		char [] ch= s1[i].toCharArray();
		String rev="";
		for(int j=ch.length-1; j>=0; j--)
		{
			rev=rev+ch[j];
		}
		res=res+rev+" ";
	}
	System.out.println(res);
}
}

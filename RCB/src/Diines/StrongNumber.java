package Diines;

public class StrongNumber {
public static void main(String[] args) {
	int n = 145; int temp=n;
	int sum = 0;
	while(n>0)
	{
		int rem = n%10;
		
		int prod = 1;
		for (int i=1; i<=rem; i++)
		{
			prod = prod*i;			
		}
		sum = sum+prod;
		
		n = n/10;
	}
	if(sum==temp)
	{
	System.out.println(temp+ " is strong number");
	}
	else
	{
		System.out.println(temp + " is not a strong number");
	}
}
}

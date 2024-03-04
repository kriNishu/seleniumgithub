package Diines;

public class PrimeNumber {
public static void main(String[] args) {
	int n = 6;
	int count = 0;
	
	for (int i= 2;i<n/2;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
	}
	if(count==0 && n!=1)
	{
		System.out.println(n+ " is primeNumber");
	}
	else
	{
		System.out.println(n+ "  is not prime number");
	}
}
}

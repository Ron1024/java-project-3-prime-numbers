//Prime Numbers Project
//07/04/2018
public class PrimeNumbers
{
	public static void main(String args[])
	{
		int primeCount = 0;
		double num;
		Boolean isPrime = true;
		for (num = 1; primeCount <= 1001 ;num += 2) //loops until 1000th prime number is reached
		{
			for (double i = 1; i <= num / 2; i++) 
			{
				if (num % i == 0)
				{
				isPrime = false;
				}
			}
			if (isPrime)
				primeCount++;
			else
				isPrime = true;

		}
		System.out.println("The 1000th prime number is: " + (int)num);
	}
}

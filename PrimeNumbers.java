//Prime Numbers Project
//07/04/2018
public class PrimeNumbers
{
	public static void main(String args[])
	{
		int primeCount = 0;
		double num;
		Boolean isPrime = true;
		for (num = 1; primeCount < 1000 ;num += 2) //loops until 1000th prime number is reached
		{
			for (double i = 2; i <= num / 2; i++)
			{
				if (num % i == 0)
				{
				isPrime = false;
				}
			}
			if (isPrime)
				{
				System.out.println(num);
				primeCount++;
				}
			else 
				isPrime = true;


		}
		System.out.println("The 1000th prime number is: " + ((int)num - 2));
	}
}

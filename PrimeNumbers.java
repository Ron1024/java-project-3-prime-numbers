//Prime Numbers Project
//07/04/2018
public class PrimeNumbers
{
	public static void main(String args[])
	{
		int primeCount = 0;
		Boolean isPrime = true;
		for (double num = 1;;num += 2) //infinite loop
		{
			for (double i = 0; i < num / 2; i++) 
			{
				if (num % i == 0)
				{
				isPrime = false;
				}
			}
		}
	}
}

//Prime Numbers Project
//07/04/2018
public class PrimeNumbers
{
	public static void main(String args[])
	{
		int primeCount = 0; //counts the number of prime numbers that have been calculated 
		double num; //number that is being tested
		Boolean isPrime = true;
		for (num = 1; primeCount < 1000 ;num += 2) //loops until 1000th prime number is reached
		{
			for (double i = 2; i <= num / 2; i++) //loops until program finds an even divisor
			{
				if (num % i == 0) //checks to see if remainder is 0
				{
				isPrime = false;
				}
			}
			if (isPrime) //moves onto the next prime number
				{
				//System.out.println(num); debugger, prints last found prime number
				primeCount++;
				}
			else 
				isPrime = true; //resets loop


		}
		System.out.println("The 1000th prime number is: " + ((int)num - 2));
	}
}

import java.io.*;
import java.util.*;
public class computingPrimes {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("How many prime numbers do you want to generate? (10^x) ");
      int size = (int)Math.floor(Math.pow(10, input.nextInt())); //Generates 10^(user input)
      int[] primes = new int[size]; //Declaring and initializing array, all elements are 0 at this point
      primes[0] = 2; //First prime in array is 2
      int position, num = 1;
      do {
         position = 0; //Counter used to keep track of current index, resets with each new number
         num += 2; //Increments by 2 because no even numbers (besides 2) are primes
         do {
            if (num % primes[position] == 0) { //Checks if number is divisible by any other primes
               break ; //Exits innermost loop if true (it's not a prime)
            }
            position++;
            if (primes[position] == 0) { //Checks if array has been exhausted
               primes[position] = num; //Adds number to array if it is a prime
               System.out.println("Prime number " + (position + 1) + " is " + num);
            }
         }
         while(primes[position] != 0);
      }
      while (primes[primes.length - 1] == 0); //Continues looping until element at last index is not 0
      System.out.println("The " + size + "th prime number is: " + num);
   }
}

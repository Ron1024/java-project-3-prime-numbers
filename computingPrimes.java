import java.io.*;
import java.util.*;
public class computingPrimes {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("How many prime numbers do you want to generate? (10^x) ");
      int size = (int)Math.floor(Math.pow(10, input.nextInt()));
      int[] primes = new int[size];
      primes[0] = 2;
      int position, num = 1;
      do {
         position = 0;
         num += 2;
         do {
            if (num % primes[position] == 0) {
               break ;
            }
            position++;
            if (primes[position == 0) {
               primes[position] = num;
               System.out.println("Prime number " + (position + 1) + " is " + num);
            }
         }
         while(primes[position] != 0);
      }
      while (primes[primes.length - 1] == 0);
      System.out.println("The " + size + "prime number is: " + num);
   }
}

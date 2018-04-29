import java.io.*;
import java.util.*;
public class computingPrimes {
   public static void main(String args[]) {
      int[] primes = new int[1000];
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
      System.out.println("The 1000th prime number is: " + num);
   }
}

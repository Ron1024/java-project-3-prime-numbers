import java.io.*;
import java.util.*;
public class computingPrimes {
   public static void main(String args[]) {
      int[] primes = new int[1000];
      primes[0] = 2;
      int position, num = 3;
      do {
         position = 0;
         do {
            if (num % primes[position] == 0) {
               
            }
            position++;
            if (primes[position == 0) {
               
            }
         }
         while(primes[position] != 0);
         num += 2;
      }
      while (primes[primes.length - 1] == 0);
   }
}

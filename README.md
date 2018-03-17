# computing-prime-numbers
In this assignment you will write a program that computes and prints the 1000th prime number. 

To help you get started, here is a rough outline of the stages you should probably follow in writing your code:
1. Initialize some state variables
1. Generate all (odd) integers > 1 as candidates to be prime
1. For each candidate integer, test whether it is prime
  1. One easy way to do this is to test whether any other integer > 1 evenly divides the candidate with 0 remainder. To do this, you can use modular arithmetic, for example, the expression a%b returns the remainder after dividing the integer a by the integer b.
  1. You might think about which integers you need to check as divisors – certainly you don’t need to go beyond the candidate you are checking, but how much sooner can you stop checking?
1. If the candidate is prime, print out some information so you know where you are in the computation, and update the state variables
1. Stop when you reach some appropriate end condition. In formulating this condition, don’t forget that your program did not generate the first prime (2). 

If you want to check that your code is correctly finding primes, you can find a list of primes at http://primes.utm.edu/lists/small/1000.txt

package com.cnf.nov10;

public class NonPrimeUsingLoops {
public static void main(String[] args) {
		
	  System.out.println("Non-prime numbers from 1 to 100 using for loop:");
      printNonPrimeFor();

      System.out.println("\nNon-prime numbers from 1 to 100 using while loop:");
      printNonPrimeWhile();

      System.out.println("\nNon-prime numbers from 1 to 100 using do-while loop:");
      printNonPrimeDoWhile();
  }

  // Using for loop
  private static void printNonPrimeFor() {							//using isprime() from intmath
      for (int i = 2; i <= 100; i++) {
          if (!isPrime(i)) {
              System.out.print(i + " ");
          }
      }
  }

  // Using while loop
  private static void printNonPrimeWhile() {
      int i = 2;
      while (i <= 100) {
          if (!isPrime(i)) {
              System.out.print(i + " ");
          }
          i++;
      }
  }

  // Using do-while loop
  private static void printNonPrimeDoWhile() {
      int i = 2;
      do {
          if (!isPrime(i)) {
              System.out.print(i + " ");
          }
          i++;
      } while (i <= 100);
  }

  // Function to check if a number is prime
  private static boolean isPrime(int num) {
      if (num < 2) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
              return true;
          }
      }
      return false;
  }
}

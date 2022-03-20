package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 7 - 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; ; i++) {
            if (checkIsPrime(i)) {
                primes.add(i);
            }
            if (primes.size() == 10001) {
                break;
            }
        }
        System.out.println(primes.get(primes.size() - 1));
    }

    public static boolean checkIsPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

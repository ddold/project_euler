package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Problem 3 - Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> factors = getFactors(600851475143L);
        List<Integer> factorPrimes = getPrimes(factors);
        factorPrimes.forEach(System.out::println);
    }

    private static List<Integer> getFactors(long num) {
        List<Integer> factors = new ArrayList<>();

        // All the factors of a number can be determined by iterating only till the square root of a number.
        // This is because each factor of a number which is lesser than its square root when divided by the
        // number gives another factor which is greater than the square root of number.
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
                factors.add((int) (num / i));
            }
        }

        return factors;
    }

    private static List<Integer> getPrimes(List<Integer> factors) {
        return factors.stream()
                .filter(App::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int num) {
        return num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(n -> (num % n == 0));
    }
}

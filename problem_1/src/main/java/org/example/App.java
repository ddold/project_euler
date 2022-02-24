package org.example;

/**
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result = solution(1000);
        System.out.println(result);
    }

    private static int solution(int maxNumber) {
        int sum = 0;
        for (int i = 3; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

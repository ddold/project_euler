package org.example;

/**
 * Problem 5 - Smallest multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sum;
        int jFactorial = getFactorial(20);
        int smallestMultiple;
        outer: for (int i = 21; ;i++) {
            sum = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if (sum == jFactorial) {
                    smallestMultiple = i;
                    break outer;
                }
            }
        }

        System.out.println("smallest multiple is " + smallestMultiple);
    }

    private static int getFactorial(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}

package org.example;

/**
 * Problem 6 - Sum square difference
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 - 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
 * sum.
 *
 */
public class App 
{
    public static final int TOTAL = 100;
    public static void main( String[] args )
    {
        int sumOfSquares = getSumOfSquares(TOTAL);
        int squareOfSum = getSquareOfSum(TOTAL);

        int difference = getDiff(squareOfSum, sumOfSquares);
        System.out.println("Difference = " + difference);
    }

    private static int getDiff(int squareOfSum, int sumOfSquares) {
        return squareOfSum - sumOfSquares;
    }

    private static int getSquareOfSum(int total) {
        int sum = 0;
        for(int i = 1; i <= total; i++) {
            sum += i;
        }
        return sum * sum;
    }

    private static int getSumOfSquares(int total) {
        int sum = 0;
        for (int i = 1; i <= total; i++) {
            sum += (i * i);
        }
        return sum;
    }
}

package org.example;

/**
 * Problem 4 - Largest palindrome product
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int maxPalindrome = 0;
        int varA = 0;
        int varB = 0;
        // work backwards because the max palindrome will be towards the end
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;
                if (checkIfPalindrome(product)) {
                    if (product > maxPalindrome) {
                        varA = i;
                        varB = j;
                        maxPalindrome = product;
                        // can break because the first palindrome got will be the largest
                        break;
                    }
                }
            }
        }
        System.out.println("The product of " + varA + " and " + varB + " creates a palindrome of " + maxPalindrome);
    }

    private static boolean checkIfPalindrome(int num) {
        int temp = num;
        int remainder;
        int sum = 0;

        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num /= 10;
        }

        return temp == sum;
    }
}

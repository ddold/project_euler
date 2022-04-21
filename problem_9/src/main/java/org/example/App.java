package org.example;

/**
 * Problem 9 - Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *      a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result = mySolution();
        System.out.println(result);
        solution();
    }

    public static int mySolution() {
        int b = 5;
        for (int a = 4; a < b; a++) {
            for (b = 5; b < 1000; b++) {
                int aSquare = a*a;
                int bSquare = b*b;

                int totalSquare = aSquare + bSquare;

                double total = Math.sqrt(totalSquare);

                if (total % 1 == 0 && b < total) {
                    if (a + b + total == 1000) {
                        return a * b * (int) total;
                    }
                }
            }
        }
        return 0;
    }

    public static void solution() {
        int s = 1000;
        for (int a = 3; a <= (s  - 3)/3; a++) {
            for (int b = (a + 1); b <= (s - 1 - a)/2; b++) {
                int c = s - a - b;
                if (c * c == (a * a) + (b * b)) {
                    System.out.println("a is " + a);
                    System.out.println("b is " + b);
                    System.out.println("c is " + c);
                }
            }
        }
    }
}

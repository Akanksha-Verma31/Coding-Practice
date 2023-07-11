/*
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.

Sample Input
36
24
Sample Output
12
72
 */

import java.util.Scanner;

public class GcdLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGcd(num1, num2);
        int lcm = calculateLcm(num1, num2);

        // Print the results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

    private static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate the Lowest Common Multiple (LCM) using the GCD formula
    private static int calculateLcm(int a, int b) {
        return (a * b) / calculateGcd(a, b);
    }
}

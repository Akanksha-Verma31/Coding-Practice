
/*
1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.

Sample Input
1440
Sample Output
2 2 2 2 2 3 3 5
 */
import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print("2" + " ");
                continue;
            } else if (n % 3 == 0) {
                n = n / 3;
                System.out.print("3" + " ");
                continue;
            } else if (n % 5 == 0) {
                n = n / 5;
                System.out.println("5" + " ");
                continue;
            } else if (n % 7 == 0) {
                n = n / 7;
                System.out.println("7" + " ");
                continue;
            } else if (n % 11 == 0) {
                n = n / 11;
                System.out.println("11" + " ");
                continue;
            } else if (n % 13 == 0) {
                n = n / 13;
                System.out.println("13" + " ");
                continue;
            }

        }
    }

}

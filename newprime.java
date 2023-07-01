/*
 1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Sample Input
5
13
2
3
4
5
Sample Output
prime
prime
prime
not prime
prime
 */

import java.util.*;

public class newprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int t = sc.nextInt();

        int flag = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            flag = 0;
            for (int j = 2; j <= t / 2; j++) {
                if (n == 2 || n == 3) {
                    flag = 1;
                    break;
                } else if (n % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }
        sc.close();

    }
}
//
/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).

Sample Input
6 
24
Sample Output
7
11
13
17
19
23

 */

import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int flag = 0;

        for (int i = low; i <= high; i++) {
            flag = 0;
            for (int j = 2; j < i / 2; j++) {
                if (i == 2 || i == 3) {
                    flag = 1;
                    break;
                } else if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

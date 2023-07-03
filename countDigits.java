/*
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Sample Input
65784383
Sample Output
8
 */

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String strNum = Integer.toString(num);
        System.out.println(strNum.length());
        sc.close();
    }

}

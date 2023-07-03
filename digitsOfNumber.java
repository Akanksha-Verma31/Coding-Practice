/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3
 */

import java.util.Scanner;

public class digitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        for (int i = 0; i < num.length(); i++) {
            System.out.println(num.charAt(i));
        }

        // int num = sc.nextInt();
        // String str = "";

        // while (num > 0) {
        // int rem = num % 10;
        // str += rem;
        // num = num / 10;
        // }
        // StringBuilder str2 = new StringBuilder(str);
        // System.out.println(str2.reverse());

    }
}

/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Sample Input
994543234
 4
Sample Output
3

 */

import java.util.Scanner;

public class digitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int search = sc.nextInt();

        int freq = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == search)
                freq++;
            num /= 10;
        }

        System.out.println(freq);

        sc.close();
    }
}

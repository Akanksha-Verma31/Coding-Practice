/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Sample Input
10
Sample Output
0
1
1
2
3
5
8
13
21
34

 */

import java.util.Scanner;

public class fiboSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0, b = 1;

        for (int i = 1; i < n; i++) {
            if (a == 0)
                System.out.println(a);
            sum = a + b;
            b = a;
            a = sum;
            System.out.println(sum);
        }
        sc.close();

    }

}

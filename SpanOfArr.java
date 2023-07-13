/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

Sample Input
6
15
30
40
4
11
9
Sample Output
36

 */

import java.util.Scanner;

public class SpanOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max, min;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(max - min);

        sc.close();
    }
}

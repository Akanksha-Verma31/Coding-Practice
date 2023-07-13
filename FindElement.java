/*
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

Sample Input
6
15
30
40
4
11
9
40
Sample Output
2

 */

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == search)
                System.out.println(i);
        }
        sc.close();
    }
}

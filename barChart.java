/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Sample Input
5
3
1
0
7
5
Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	

 */

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	
 */

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2;
        int count = 1;

        // for printing the upper half
        for (int i = Math.abs(m); i >= 0; i--) {
            if (i <= Math.abs(m)) {
                for (int k = i; k >= 0; k--) {
                    System.out.print("*");
                }
            }
            if (count % 2 != 0) {
                for (int k = 1; k <= count; k++) {
                    System.out.print(" ");
                }
            }
            if (i <= Math.abs(m)) {
                for (int k = i; k >= 0; k--) {
                    System.out.print("*");
                }
            }
            count = count + 2;
            System.out.println();
        }

        count = Math.abs(m) + 1;

        // for printing the lower half
        for (int i = 1; i <= Math.abs(m) + 1; i++) {
            if (i <= Math.abs(m)) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            }
            if (count % 2 != 0) {
                for (int k = count; k > 0; k--) {
                    System.out.print(" ");
                }
            }
            if (i <= Math.abs(m)) {
                for (int k = i; k >= 0; k--) {
                    System.out.print("*");
                }
            }
            count = count - 2;
            System.out.println();
        }
        sc.close();
    }
}

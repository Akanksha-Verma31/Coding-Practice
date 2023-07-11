/* 
		*	
	*		*	
*				*	
	*		*	
		*	
 */

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = n / 2;
        int s2 = 0;
        for (int i = 1; i <= n / 2 + 1; i++) {
            if (s1 > 0) {
                for (int j = 1; j <= s1; j++)
                    System.out.print(" ");
            }
            System.out.print("*");
            if (s2 > 0) {
                for (int j = 1; j < s2; j++)
                    System.out.print(" ");
            }
            if (s2 != 0)
                System.out.print("*");
            s1--;
            s2 = s2 + 2;

            System.out.println();
        }
        s1 = 1;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (s1 > 0) {
                for (int j = 1; j <= s1; j++)
                    System.out.print(" ");
            }
            System.out.print("*");
            if (s1 > 0) {
                for (int j = 1; j <= s1; j++)
                    System.out.print(" ");
            }
            if (s1 == 1)
                System.out.print("*");
            s1++;
            System.out.println();
        }
        sc.close();
    }
}

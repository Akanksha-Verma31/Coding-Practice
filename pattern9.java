/* 
*				*	
	*		*		
		*			
	*		*		
*				*	
 */

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0, s2 = 3;
        for (int i = 1; i <= n / 2 + 1; i++) {
            if (s1 > 0) {
                for (int j = 1; j <= s1; j++)
                    System.out.print(" ");
            }
            s1++;
            System.out.print("*");
            if (s2 > 0) {
                for (int j = 1; j <= s2; j++)
                    System.out.print(" ");
            }
            s2 = s2 - 2;
            if (i != 3) {
                System.out.print("*\n");
            } else
                System.out.println();

        }

        s1 = 1;
        s2 = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (s1 == 1) {
                for (int j = 1; j <= s1; j++)
                    System.out.print(" ");
            }
            s1++;
            System.out.print("*");
            if (s2 > 0) {
                for (int j = 1; j <= s2; j++)
                    System.out.print(" ");
            }
            s2 = s2 + 2;
            if (i != 3) {
                System.out.print("*\n");
            } else
                System.out.println();

        }

        sc.close();
    }
}

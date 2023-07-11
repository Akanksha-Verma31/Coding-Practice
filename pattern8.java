/*
				*	
			*		
		*			
	*				
*
 */

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 4;
        for (int i = n - 1; i >= 0; i--) {
            if (space > 0) {
                for (int j = 1; j <= space; j++)
                    System.out.print(" ");
            }
            space--;
            System.out.print("*\n");
        }

        sc.close();
    }
}

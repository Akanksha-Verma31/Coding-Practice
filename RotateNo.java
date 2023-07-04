
/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340

Sample Input
562984
2
Sample Output
845629

 */

import java.util.Scanner;

public class RotateNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int len = s.length();
        int Rotations = n % len;
        String rotatedStr;
        if (Rotations > 0) {
            rotatedStr = s.substring(len - Rotations) + s.substring(0, len - Rotations);
        } else {
            rotatedStr = s.substring(-Rotations) + s.substring(0, -Rotations);
        }

        int rotatedNumber = Integer.parseInt(rotatedStr);
        System.out.println(rotatedNumber);
    }

}

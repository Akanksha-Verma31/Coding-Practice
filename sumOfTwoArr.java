/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Sample Input
5
3
1
0
7
5
6
1
1
1
1
1
1
Sample Output
1
4
2
1
8
6

 */

import java.util.*;

public class sumOfTwoArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size and elements of array a1
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }

        // Input size and elements of array a2
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }

        // Reverse both arrays to align the least significant digits
        reverseArray(a1);
        reverseArray(a2);

        // Perform addition and store the result in a new array
        int[] result = addArrays(a1, a2);

        // Print the result array
        printArray(result);
    }

    // Function to reverse an array
    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Function to add two arrays representing digits of two numbers
    private static int[] addArrays(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int maxLen = Math.max(n1, n2);
        int[] result = new int[maxLen + 1]; // To accommodate any carry at the most significant digit

        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int sum = carry;
            if (i < n1)
                sum += a1[i];
            if (i < n2)
                sum += a2[i];

            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0)
            result[maxLen] = carry;
        else
            result = Arrays.copyOf(result, maxLen); // Trim the result array if no carry at the most significant digit

        return result;
    }

    // Function to print an array
    private static void printArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

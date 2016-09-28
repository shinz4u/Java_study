package com.company;

/**
 * Created by mohammedshinoy on 2016-09-28.
 */
public class ArrayLeftRotation {


    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] b = new int[n];
        k = k % n;
        for (int j = 0; j < n; j++) {
            int index = j;
            if ((index - k) < 0) {
                index = (n - k) + index;
            } else {
                index = index - k;
            }
            b[index] = a[j];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5}; // Desired array you want to rotate.
        int n = a.length;
        int k = 4; // Number of Rotations needed (set this

        int[] output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
    }
}

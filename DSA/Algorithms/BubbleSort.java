package DSA.Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { -30, -54, 1, 0, 2, -89,89 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

// also known as comparison /syncing /exchange sort
// At every pass/iteration the largest element of the array will come at last
// with every pass last part of the array becomes sorted so we dont need to
// compare it

// space complexity - O(1)
// time complexity - best - O(n) - when the array is already sorted
// - worst - O(n^2) - when array is sorted in reverse order

// stable - when it maintains the original order for the same values after
// sorting
// unstable - not maintains

// implementation properly resets swapped at the start of each outer loop iteration, sets it to true if a swap occurs, and breaks out of the loop if no swaps happen.
//Potential Edge Cases Where It Works Well
//Already sorted array → Exits after the first pass, making it O(n) instead of O(n²).
// Reversed array → Runs full passes, correctly sorting it.
//Uses two nested loops:
// The outer loop (i) runs for each pass over the array.
// The inner loop (j) compares adjacent elements and swaps them if needed.
// The swapped flag keeps track of whether any swaps occurred:
// If no swaps happen in a pass, the array is already sorted, and the loop breaks early (optimization).

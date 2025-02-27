package DSA.Algorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 11, 30, 45, 67 };
        // int[] arr = { 34, 23, 12, 8, 7, 6, 4, 2 };
        int target = 67;

        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (target < arr[mid]) {
                end = mid - 1;
                // start = mid + 1;

            } else {
                start = mid + 1;
                // end = mid - 1;
            }
        }
        return -1;

    }

}

// binary search can only be applied for sorted array (ascending / descending)
// (start+end)/2 this may exceed the int limit for larger numbers ;
// space complexity
// time complexity in best case - O(1) - mid 
// wort, average case is log(n) -
// n is number of elements in the array
// ex: log base 2(16) = 4 comparisions

// to check if an array is sorted in which order compare (start and end)-
// start < end - ascending else descending

package DSA.Algorithms;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = { -11,-5,-2,2, 4, 6, 11, 30, 45, 67 };
        // int[] arr = { 34, 23, 12, 8, 7, 6, 4, 2,-1,-4 };
        int target = -5;

        int ans = fun(arr, target);
        System.out.println(ans);
    }


    static int fun(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find wheather array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            }
            if (isAsc) {
                if (target < arr[mid]) {

                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]) {

                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

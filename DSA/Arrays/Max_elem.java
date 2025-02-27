public class Max_elem {
    public static void main(String[] args) {

        int[] arr = { 1, 22, 3, 45, 5 };

        System.out.println(max(arr));
        System.out.println(max_in_range(arr, 1, 3)); // pass the index range

    }

    static int max(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int max_in_range(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

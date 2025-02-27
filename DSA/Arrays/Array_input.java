import java.util.Arrays;
import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter elements ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing array in 3 ways

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // for each loop
        for (int i : arr) { // i represents each element of the array
            System.out.print(i + " ");
        }
        System.out.println();

        // toString method
        System.out.print(Arrays.toString(arr));

        sc.close();
    }
}

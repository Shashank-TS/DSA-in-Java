import java.util.Arrays;
import java.util.Scanner;

public class Multidim_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MULTIDIMENSIONAL ARRAY

        // int[][] arr = {
        //     { 1, 2, 3 },
        //     { 4, 5, 6, 7 }
        // };

        // int [row][col] adding the row size is mandatory, col size can be variable
        int[][] ar = new int[2][3];


        // // input for fixed size column
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         ar[i][j] = sc.nextInt();
        //     }
        // }

        // input 
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        // printing

        // using for loop
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.print("\n");
        }

        // using toString()
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
            }
        
        // for each loop
        for(int[] a:ar){
            System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.deepToString(ar));
     
        sc.close();
        
    }

}
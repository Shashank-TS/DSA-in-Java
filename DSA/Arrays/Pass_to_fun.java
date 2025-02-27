import java.util.Arrays;
public class Pass_to_fun {
    
    // arrays are mutable - we can change the object
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] Myarray) {
        Myarray[0]=99;    // This will change the value because it is non primitive type
        
    }
}
    


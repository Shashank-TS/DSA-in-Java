//creating an array
public class Array{
    public static void main(String args[]){
        
        int[] arr = new int[4];

        // inline initializing
        // int[] array={1,2,3,4,5,6};

        arr[0]=4;
        arr[1]=6;
        arr[2]=5;
        arr[3]=3;

        //to change the valve
        arr[1]=2;

        //iterating the array

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
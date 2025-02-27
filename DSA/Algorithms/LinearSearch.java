package DSA.Algorithms;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={3,5,3,7,8,0,1};
        int target=1;

        System.out.println(LS(arr,target));
    }

    static int LS(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }   
}

// can be applied for both sorted and unsorted array
// time complexity -
// best case - O(1) - found item in the first index
// average case - O(n) - do not find the target item
// worst case - O(n)

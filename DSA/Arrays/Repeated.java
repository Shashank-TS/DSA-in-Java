
public class Repeated {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,3,3,3,3,4,4,5};
        int target=3;
        
        int count=0;
        
        for(int i=arr.length-1;i>=0;i--){
        
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);    
    }       
}
    


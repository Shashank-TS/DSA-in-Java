public class Duplicate_item {
    public static void main(String[] args) {

        int[] arr={1,2,4,3};
        int ele=0;
        boolean res=false;

        for(int i=0;i<arr.length;i++){
            ele=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==ele){
                    res=true;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}

    


public class Factorial {
    public static void main(String[] args) {
        int num=5, fact=1;
        
        for(int i=1;i<=num;i++){
            fact*=i;

            // System.out.println(fact);  
            // display fact of all numbers - 1,2,6,24,120
        }
        System.out.println(fact);
    }    
}

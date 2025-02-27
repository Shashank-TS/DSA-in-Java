//The sum of individual digits raised to the power of digit count equal to the original number
//there are no 2 digit arm number it starts from 153

public class Armstrong_num{

    public static void main(String[] args) {
        int number=153;
        int sum=0;
        int n=number;
        while(n>0){
            int rem=n%10;
            int cube=rem*rem*rem;
            
            sum=sum+cube;

            n=n/10;
        }
        if(sum==number){
            System.out.println("yes it is armstrong number");
        }
    }
}

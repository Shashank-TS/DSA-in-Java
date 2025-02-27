import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;

        while (true) {
            System.out.println("enter the operation| press x for exit");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                sc.close();

                switch(op){
                    case '+':result = num1 + num2;
                    break;
                    case '-':result = num1 - num2;
                    break;
                    case '*':result = num1 * num2;
                    break;
                    case '/':if(num2==0){
                        System.out.println("cannot ivide by zero");
                    }else{
                        result = num1 / num2;
                    }
                    break;   
                    case '%':result = num1 % num2;     
                }
                
            } else if (op == 'x' || op == 'X') {
                System.exit(0);
            } else {
                System.out.println("invalid opertion");
            }
            
            System.out.println("result: "+result);

        }

    }

}

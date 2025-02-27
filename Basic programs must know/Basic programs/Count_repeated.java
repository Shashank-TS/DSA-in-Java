import java.util.Scanner;

public class Count_repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter the number to count");
        int num = sc.nextInt();

        int count = 0, rem;
        while (n > 0) {
            rem = n % 10;
            if (rem == num) {
                count++;
            }
            n = n / 10;

        }
        System.out.println("count: "+count);
        sc.close();
    }

}

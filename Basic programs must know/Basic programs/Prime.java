
public class Prime {
    public static void main(String[] args) {

        int num = 2;
        boolean isprime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
            }
        }

        if (isprime) {
            System.out.println("this is a prime number");
        } else {
            System.out.println("this is not prime");
        }

    }
}

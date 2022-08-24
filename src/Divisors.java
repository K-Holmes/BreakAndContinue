import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = console.nextInt();

        System.out.print("Divisors of " + num+" "+ "="+" " );

        //loop variables = i
        //loop checks for any possible numbers that are evenly divisible by the user's number
        //loop repeats until it reaches the given number
        for (int i = 1; i < num; i++) {
            //checks if it's evenly divisible
            if (num % i != 0) {
                continue;
            }
            //prints out what is evenly divided (divisors)
            System.out.print(i + " , ");
        }
    }
}

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number to begin adding, 0 to quit");
        int num, sum, counter = 0;
        num = sc.nextInt();
        sum = num;
        counter++;
        while (num != 0 && counter != 10){
            System.out.println("Give another number to continue adding, 0 to quit:");
            num = sc.nextInt();
            if (num == 0 || counter == 10){
                break;
            }
            sum = sum + num;
            counter++;
        }
        System.out.println(sum);


    }
}

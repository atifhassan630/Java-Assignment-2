import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number, sum = 0, digits = (int) Math.log10(number) + 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digits,digits);
            number /= 10;
        }

        System.out.println(originalNumber == sum ? originalNumber + " is an Armstrong number." : originalNumber + " is not an Armstrong number.");

        sc.close();
    }
}

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int numberInput = sc.nextInt();  

       
        int originalNumber = numberInput;
        int reversedNumber = 0;

        while (numberInput != 0) {
            int digit = numberInput % 10;  
            reversedNumber = reversedNumber * 10 + digit;  
            numberInput /= 10;  
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}

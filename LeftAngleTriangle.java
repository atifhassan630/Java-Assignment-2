import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number  ");
        int rows = scanner.nextInt();

       
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }5

        scanner.close();
    }
}

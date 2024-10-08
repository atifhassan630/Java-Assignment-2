import java.util.Scanner;

public class DaysInMonth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the month (1-12): ");

        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int days = 0
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
               
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;  
                } else {
                    days = 28;  
                }
                break;
            default:
                System.out.println("enter a month between 1 and 12.");
                sc.close();
                return;
        }

        System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
        sc.close();
    }
}

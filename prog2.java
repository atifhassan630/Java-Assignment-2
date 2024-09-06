import java.util.Scanner;

public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        int Student = sc.nextInt();
       
        if (Student <= 24) { 
            System.out.println("Failed");
        } else if (Student >= 25 && Student < 30) { 
            System.out.println("Just pass");
        } else if (Student >= 31 && Student <=59 ) { 
            System.out.println("Student pass with good numbers");
        } else if (Student >= 60) { 
            System.out.println("Student passed with distinction");
        } else {  
            System.out.println("Invalid input");
        }
        sc.close(); 
    }
}

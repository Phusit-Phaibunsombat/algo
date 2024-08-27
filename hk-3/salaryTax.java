import java.util.Scanner;

public class salaryTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary");
        float salary = scanner.nextFloat();
        float tax = salary *(10/100.00f);
        System.out.println(tax);
        
    }
    
}

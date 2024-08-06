import java.util.Scanner;

public class Celaius
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int mySalary = 2000;
        System.out.print("Enter fahrenheit degree: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        double roundedCelaius = Math.round(celsius * 100.0) / 100.0;
        System.out.println(fahrenheit + " fahrenheit is equal to" + roundedCelaius + "Celaius.");
        scanner.close();  
        
    }
    
}

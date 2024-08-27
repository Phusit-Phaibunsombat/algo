import java.util.Scanner;

public class bmiCalculator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your weight in kilograms : ");
        byte kilogra = scanner.nextByte();
        System.out.print("Enter your weight in meters : ");
        float meters = scanner.nextFloat();
        double BMI = kilogra/(meters*meters);
        System.out.println("Your BMI for weight =" + kilogra +" kg"+ " and height = " + meters +"meters is :"+BMI+" bmi.");
        scanner.close();
    }
}
import java.util.Scanner;

public class fiveVariable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int sum = num1+num2+num3+num4+num5;
        long Variable = num1*num2*num3*num4*num5;
        System.out.println(sum);
        System.out.println(Variable);
        scanner.close();

    }
    
}

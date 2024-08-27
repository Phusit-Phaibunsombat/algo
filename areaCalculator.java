import java.util.Scanner;

public class areaCalculator {

    public static void main(String[] args) {
        Scanner basesc = new Scanner(System.in);
        Scanner heightsc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        byte base = basesc.nextByte();
        System.out.print("Enter the base of the triangle : ");
        byte height = heightsc.nextByte();
        double triangle = (base/2)*height;
        System.out.println("Area of the triangle " + triangle +"square units");
        
        System.out.println("--------------------------------- ");
        
        Scanner Lengthsc = new Scanner(System.in);
        Scanner Widthsc = new Scanner(System.in);
        System.out.print("Enter the base of the square : ");
        byte Length = Lengthsc.nextByte();
        System.out.print("Enter the base of the square : ");
        byte Width = Widthsc.nextByte();
        double square = Length*Width;
        System.out.println("Area of the triangle " + square +" square units");
        basesc.close();
        heightsc.close();
        Lengthsc.close();
        Widthsc.close();

    }
}
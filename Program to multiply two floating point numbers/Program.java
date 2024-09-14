import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first floating point number: ");

        float a = in.nextFloat();
        
        System.out.print("Enter the second floating point number: ");

        float b = in.nextFloat();
        
        float mul = a * b;
        
        System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
        in.close();
    }
}
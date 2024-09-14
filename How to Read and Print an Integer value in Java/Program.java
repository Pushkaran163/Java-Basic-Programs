// How to Read and Print an Integer value in Java

import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        int number;

        System.out.print("Enter the integer: ");

        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();

        System.out.println("The entered integer is : " + number);

        scanner.close();
    }
}
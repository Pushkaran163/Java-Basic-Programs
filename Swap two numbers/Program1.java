// Approach 1: Swapping the Values Using Third Variable

import java.util.Scanner;

public class Program1{

    static void swap(int num1, int num2){
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After Swapping : " + "first number = " + num1 + " second number = " + num2);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        swap(num1, num2);
        in.close();
    }
}
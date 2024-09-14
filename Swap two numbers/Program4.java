// Approach 4: Using arithmetic operators

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();

        a = (a+b) - (b = a);

        System.out.println("After swapping : " + " FIRST NUMBER = " + a + " SECOND NUMBER = " + b);
        in.close();
    }
}

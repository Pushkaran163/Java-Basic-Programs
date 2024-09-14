// Approach 3: Swapping the Values Using Operator

import java.util.Scanner;

public class Program3 {
    static void swap(int num1, int num2){
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping : " + " FIRST NUMBER = " + num1 + " SECOND NUMBER = " + num2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();
        swap(a, b);

        in.close();
    }
}

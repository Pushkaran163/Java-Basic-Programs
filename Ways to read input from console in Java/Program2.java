// 2. Using Scanner Class

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        System.out.println("Entered string is " + s);

        int a = in.nextInt();
        System.out.println("Entered integer is " + a);

        float f = in.nextFloat();
        System.out.println("Entered float is " + f);

        in.close();
    }
}

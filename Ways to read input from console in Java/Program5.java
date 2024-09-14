// 5. Using DataInputStream class

import java.io.*;

public class Program5 {
    public static void main(String[] args)throws IOException{
        DataInputStream reader = new DataInputStream(System.in);

        System.out.print("Enter integer: ");
        int inputInt= Integer.parseInt(reader.readLine());

        System.out.print("Enter a string: ");
        String inputString = reader.readLine();
        System.out.println("You entered integer: " + inputInt);
        System.out.println("You entered string: " + inputString);
    }
}

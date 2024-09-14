// 4. Using Command line argument

public class Program4 {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("The command line arguments are: ");
            for (String value : args)
                System.out.println(value);
        }
        else
            System.out.println("No command line agruments found.");
    }
}

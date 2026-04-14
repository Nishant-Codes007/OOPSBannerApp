public class App3{
    public static void main(String[] args) {
        // Check if the user provided any names
        if (args.length > 0) {
            // Loop through every name provided in the command line
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default message if no arguments are passed
            System.out.println("Hello World");
        }
    }
} 
    


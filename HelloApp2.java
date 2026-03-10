public class HelloApp2 {
    public static void main(String[] args) {
        // UC2: Check if a command-line argument (user input) was provided
        if (args.length > 0) {
            // Read the first argument passed from the terminal
            String userName = args[0];
            System.out.println("Hello, " + userName + "!");
        } else {
            // Fallback to basic UC1 behavior if no argument is given
            System.out.println("Hello World");
        }
    }
}

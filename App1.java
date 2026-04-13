public class App1 {
    public static void main(String[] args) {
        String name;

        // Check if a command-line argument was provided
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}
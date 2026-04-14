public class HelloApp6 {
    public static void main(String[] args) {
        // Handle the default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = "Hello ";
            
            // Enhanced for loop to build the string
            for (String name : args) {
                greeting += name + ", ";
            }
            
            // Remove the trailing delimiter (the last ", ")
            // substring(0, length - 2) removes the last two characters
            greeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(greeting);
        }
    }
}
public class HelloApp7 {
    public static void main(String[] args) {
        // Handle the default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // String.join(delimiter, array) handles the concatenation for you
            // It puts ", " between names but NOT after the last name
            String names = String.join(", ", args);
            
            System.out.println("Hello " + names);
        }
    }
}
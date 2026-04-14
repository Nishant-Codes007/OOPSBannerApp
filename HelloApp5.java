public class HelloApp5 {
    public static void main(String[] args) {
        // Handle the default case first
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // The Enhanced For Loop (For-Each)
            // Reads as: "For every String 'name' in the 'args' array"
            for (String name : args) {
                System.out.println("Hello, " + name);
            }
        }
    }
}
    


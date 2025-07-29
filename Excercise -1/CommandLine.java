public class CommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Command line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments passed.");
        }
    }
}
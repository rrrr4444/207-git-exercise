import java.io.PrintWriter;

/**
 * Print out the actual arguments from the command line.
 */

public class CommandLineArguments {
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out, true);
        pen.println("There are " + args.length + " command-line arguments.");
        for (int i = 0; i < args.length; i++) {
          pen.printf("%2d: %s\n", i, args[i]);
        } // for
      } // main
}

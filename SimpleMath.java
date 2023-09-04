import java.io.PrintWriter;

public class SimpleMath {
    public static void main(String[] args) throws Exception {
        PrintWriter pen = new PrintWriter(System.out, true);
        int x = 3;
        int y = 4;
        pen.printf("Adding %d and %d gives us %d\n", x, y, x + y);
        pen.flush();
      } // main(String[])
}

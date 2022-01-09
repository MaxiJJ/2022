import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);

        pw.println("first row");
        pw.println("second row");

        pw.close();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    public static ArrayList<String> ReadFile(String filename) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));
        scanner.useDelimiter("\r\n");
        while(scanner.hasNext()) words.add(scanner.next());
        scanner.close();
        return words;
    }
}

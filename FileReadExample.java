import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = br.readLine();
            System.out.println("First line of file: " + line);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}

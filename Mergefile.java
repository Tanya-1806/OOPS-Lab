import java.io.*;

public class Mergefile {
    public static void main(String[] args) {
        try {
        
            BufferedReader reader1 = new BufferedReader(new FileReader("data.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("data2.txt"));

            
            BufferedWriter writer = new BufferedWriter(new FileWriter("merged.txt"));

            String line;

            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
import java.io.*;
import java.util.Scanner;

public class Replacefile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name (with .txt): ");
            String fileName = sc.nextLine();

            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            String oldContent = "";

            while ((line = reader.readLine()) != null) {
                oldContent = oldContent + line + System.lineSeparator();
            }
            reader.close();

            System.out.print("Enter text to replace: ");
            String oldText = sc.nextLine();

            System.out.print("Enter new text: ");
            String newText = sc.nextLine();

            String newContent = oldContent.replace(oldText, newText);

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(newContent);
            writer.close();

            System.out.println("Content replaced successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
} 

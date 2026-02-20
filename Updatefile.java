import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Updatefile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name (with .txt): ");
            String fileName = sc.nextLine();

            System.out.println("Enter new content for the file:");
            String content = sc.nextLine();

            FileWriter writer = new FileWriter(fileName);

            writer.write(content);
            writer.close();

            System.out.println("File updated successfully.");

        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }

        sc.close();
    }
{
    
}
}
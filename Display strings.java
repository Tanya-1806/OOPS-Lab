//display strings you have entered 
import java.util.Scanner;

class Displaystrings {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = s.nextInt();
        s.nextLine();   // consume newline

        String str[] = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        s.close();
    }
}

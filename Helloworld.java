//WAP TO PRINT HELLO WORLD 
// class Helloworld{
// public static void main(String arg[])
// {
//     System.out.println("Hello world");
// }
// }


//WAP TO PRINT EVEN NUMBERS
// class Helloworld{
// public static void main(String arg[])
// {
//     int size=20;
//     for(int i=0;i<size;i++)
//     {
//         if (i%2==0){
//        System.out.println(i);}
// }
// }
// }


//WAP TO TAKE INPUT FROM USER AND DISPLAY THE ARRAY
import java.util.Scanner;

class Helloworld {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}


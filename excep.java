import java.util.Scanner;
class excep {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner s=  new Scanner(System.in);
        n=s.nextInt();
        try{
        for(int i=0;i<=n;i++) {
            sum+=n/i;
        }
        System.out.println("The sum is: " + sum);
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    // finally {
    //     s.close();
    // }
    // static int n(int i) {
    //     if (i == 0) {
    //         throw new ArithmeticException("Division by zero");
    //     }
    //     return 1 / i;
    // }
}

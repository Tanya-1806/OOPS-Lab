import java.util.Scanner;
class Static1 {
    //static int n; 
    int n;
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        Static1 m = new Static1();
        //int n;
        m.n=s.nextInt();
        //n=s.nextInt();
        //System.out.print(n);
        System.out.print(m.n);
     s.close();
    }
    
}

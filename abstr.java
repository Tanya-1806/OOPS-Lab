 abstract class A {
    abstract int compare(String S1, String S2);
 }

 class B extends A {
    int compare(String S1, String S2) {
        if (S1.equals(S2)) return 1; else return 0;
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        int x= obj.compare (args[0], args[1]);
    }
}   
class WithoutStatic {
    int n=100;
    public static void main(String[] args) {
       WithoutStatic obj = new WithoutStatic();
       System.out.println("Using object: " + obj.n);
    }
    
}

class sumofarraycmd {
    public static void main(String args[]) {

        int sum = 0;

        if (args.length == 0) {
            System.out.println("No elements provided!");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
 

 //WAP TO CHECK WHETHER ARRAY CONTAINS DUPLICATE OR NOT

 class Duplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 20}; 
        boolean answer = false;

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    answer = true;
                    break;
                }
            }

            if (answer)
                break;
        }

        
        if (answer)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

    


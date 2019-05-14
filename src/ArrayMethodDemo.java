public class ArrayMethodDemo {
    public static void main(String[] args){
        int [] number = new int[10] ;

        displayFor(number);
    }
    public static void displayFor(int [] number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int j = number.length-1 ; j >=0 ; j--){
            System.out.println(number[j]);

        }

    }


}


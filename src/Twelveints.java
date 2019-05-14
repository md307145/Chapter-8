public class Twelveints {
    public static void main(String[] args){
        int [] number = {1,2,3,4,5,6,7,8,9,10,11,12} ;

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


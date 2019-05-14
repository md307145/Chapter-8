import java.util.Scanner;

public class DistanceFromAvrage {
    public static void  main(String[] args){
        int[] number=new int[20];
        int entry;
        int total=0;
        int count=0;
        int average=0;
        boolean quit=true;
        Scanner k=new Scanner(System.in);
        while (quit){
            System.out.println("enter numbers or press 999 to end.");
            entry = k.nextInt();
            if (count == number.length -1){
                quit = false;
                count--;
            }
            else if(entry== 999) {
                quit = false;
            }
            if(count == 0){
                System.out.println("Error. you don't have all 20 numbers");
                number[0] = 0;
            }
            number[count] = entry;
            count++;

        }
        for(int i=0; i < number.length;i++ ){
            total=total+number[i];



        }
        average = total /number.length;
        System.out.println("The average of all is  "+average);
        for(int i = 0; i <= number.length;i++){
            if(number[i] ==0 ) {
                System.out.println();
            }
            else
                System.out.println(average-number[i]);
        }
    }



    public static void displayFor(int[] number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int j = number.length-1 ; j >=0 ; j--){
            System.out.println(number[j]);

        }
    }

}


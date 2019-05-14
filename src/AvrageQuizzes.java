import java.util.Scanner;

public class AvrageQuizzes {
    public static void main(String []args){
        int[] scores=new int[10];
        int entry;
        int total=0;
        int count=0;
        int average=0;
        int high=0;
        int low=100;
        boolean quit=true;
        Scanner k=new Scanner(System.in);
        while (quit){
            System.out.println("Please enter some test scores");
            entry = k.nextInt();
            if (count == scores.length -1){
                quit = false;
                count--;

            }
            scores[count] = entry;
            count++;

            }
            for(int i=0; i < scores.length;i++ ){
            total=total+scores[i];
            if(scores[1]>high){
                high=scores[1];
            }
            else if(scores[1]<low){
                low = scores[1];
            }

        }
        average = total /scores.length;
        System.out.println("the average score is "+average);}

    }


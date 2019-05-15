import java.util.Scanner;

public class DistanceFromAvrage {
    public static void main(String[] args) {
        int[] number = new int[20];
        int entry;
        int total = 0;
        int count = 0;
        int average = 0;
        boolean quit = true;

        while (quit) {
            Scanner k = new Scanner(System.in);

            System.out.println("enter numbers or press 999 to end.");
            entry = k.nextInt();

            if (count == number.length - 1) {
                quit = false;
                count--;
            } else if (entry == 999) {
                System.out.println("You need to do all 20 number");
                number[count + 1] = 0;
                quit = false;
            }
            number[count] = entry;
            total = total + number[count];
            count++;
        }
        average = (total-999)/ count;
        System.out.println("The average is " + average);

        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0 || number[i] ==999) {
                System.out.print("");
            }
            else
                System.out.println(number[i]-average);
        }

        }
    }



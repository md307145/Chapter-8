import java.util.Scanner;

public class ArraymethodDemo433 {
    public static void main(String[] args) {
        int[] number = new int[10];
        int entery;
        int count = 0;
        int sum;
        boolean quit = true;
        Scanner k = new Scanner(System.in);

        while (quit) {
            System.out.println("Enter 10 numbers or 99 to end ");
             entery = k.nextInt();
            if (count == number.length - 1)
                quit = false;
            else if (entery == 99) {
                System.out.println("You din't enter all 10 numbers");
                quit = false;
            }

            number[count] = entery;
            count++;

        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int j = number.length - 1; j >= 0; j--) {
            System.out.println(number[j]);

        }
        sum =  entery+entery;

    }
}



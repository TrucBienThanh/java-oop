package Day2;

import java.util.Scanner;

public class ForHinhThapv2 {
    public static void main(String[] args) {

        int currentNumber = 0;
        while (currentNumber < 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number is greater than 1: ");
            currentNumber = scanner.nextInt();
        }

        /*
        currentNumber = # of lines
                    *           i = 4 ; j = 1
                 *  *           i = 3 ; j = 2
              *  *  *           i = 2 ; j = 3
           *  *  *  *           i = 2 ; j = 4
        *  *  *  *  *           i = 5 ; j = 0
        */

        int number = 1;
        while (number <= currentNumber)
        {
            for (int i = currentNumber - number; i >= 1; i--) {System.out.print("   ");}
            for (int j = number; j >= 1; j--) {System.out.print(" * ");}
            {
                System.out.println(" ");
            }
        number++;
        }
    }
}

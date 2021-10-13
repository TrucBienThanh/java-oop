package Day2;

import java.util.Scanner;

public class ForHinhThapNguoc {
    public static void main(String[] args) {

        int currentNumber = 0;
        while (currentNumber < 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number is greater than 1: ");
            currentNumber = scanner.nextInt();
        }

        /*
        currentNumber = # of lines
        *  *  *  *  *           i = currentNumber
        *  *  *  *              i = currentNumber - 1
        *  *  *                 i = currentNumber - 2
        *  *                    i = currentNumber - 3
        *                       i = currentNumber - 4
         */

        int number = currentNumber;
        while (number >= 1) {
            for (int i = number; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();
            number--;

        }
    }
}

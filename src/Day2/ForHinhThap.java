package Day2;

import java.util.Scanner;

public class ForHinhThap {
    public static void main(String[] args) {

        int currentNumber = 0;
        while (currentNumber < 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number is greater than 1: ");
            currentNumber = scanner.nextInt();
        }

        /*
        currentNumber = # of lines
        *               i = 1
        *  *            i = 2
        *  *  *         i = 3
        *  *  *  *      i = 4
         */
        int number = 1;
        while (number <= currentNumber) {
            for (int i = 1; i <= number; i++) {
                System.out.print("*");
            }
            System.out.println();
            number++;
        }
    }
}

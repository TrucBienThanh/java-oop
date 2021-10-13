package Day1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class VariablePractice {
    public static void main(String[] args) {

//        int i = 1;
//        if (i == 0) {
//            System.out.println("I = 0");
//        } else {
//            System.out.println("I khac 0");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.printf("Nunber %d is even number!", inputNumber);
        } else {
            System.out.printf("Number %d is odd number!", inputNumber);
        }
    }
}

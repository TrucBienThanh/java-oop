package Day2;

import java.util.Scanner;

public class IfStatment {
    // So chan so le
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber != 0) {
            if (inputNumber % 2 == 0) {
                System.out.println("Day la so chan");
            } else {
                System.out.println("Day la so le");
            }
        } else {
            System.out.println("Day la so 0");
        }
    }
}

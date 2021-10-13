package Day2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber < 2 || inputNumber > 8)
            {
            System.out.println("Please enter your number from 2 to 8: ");
            inputNumber = scanner.nextInt();
             }
            else{
            switch (inputNumber) {
                case 2:
                    System.out.println("Thu 2");
                    break;
                case 3:
                    System.out.println("Thu 3");
                    break;
                default:
                    System.out.println("Chu nhat");
                    break;
            }
        }
    }
}

package Day2;

import java.util.Scanner;

import static java.lang.System.out;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        out.println("Please enter your number: ");
        int inputNumber = scanner.nextInt();

        for (int currentNum = inputNumber; currentNum > 0; currentNum--) {
            for (int i = 1; i <= currentNum; i++)
                {
                out.print("*");
                }
            out.println();
        }
    }
}
package Day2;

import java.util.Scanner;

public class HomeWorkGiaiThua {
    public static void main(String[] args) {

        int currentNumber = 0;
        while (currentNumber < 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number is greater than 1: ");
            currentNumber = scanner.nextInt();
        }
            /* Tính giai thua:
            x = 5
            result = 5*4*3*2*1
             */
            int result = 1;
            for (int i = 1; i <= currentNumber; i++) result = i*result;
            System.out.println(result);
            }
    }

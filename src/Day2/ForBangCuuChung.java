package Day2;

import java.util.Scanner;
import java.util.SortedMap;

public class ForBangCuuChung {
    public static void main(String[] args) {

        int number = 0;
        while (number < 1 || number > 9) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number from 1 to 9: ");
            number = scanner.nextInt();
        }

        System.out.println("Bang cuu chuong " + number + ": ");
        for (int i = 1; i <= 10; i++) {
//          System.out.println(number + " x " + i + " = " + number * i);
            System.out.printf("%d x %d = %d %n",number, i, number * i);
        }
    }

}

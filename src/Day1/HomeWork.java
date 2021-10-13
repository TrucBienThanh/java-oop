package Day1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //input your first number
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int a = scanner1.nextInt();
        System.out.println("Your first number is: " + a);

        //input your second number
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your second number: ");
        int b = scanner2.nextInt();
        System.out.println("Your second number is: " + b);

        //sum
        int sum = a + b;
        System.out.println("Tong 2 so cua ban là :" + sum);

        //multiple
        int mult = a * b;
        System.out.println("Tich 2 so cua ban là :" + mult);

        //substract and device
        int substract;
        int device;
        int device_;
        boolean isabiggerthanb = a > b;

        if (isabiggerthanb == true)
             {
                 substract = a - b;
                 device = a / b;
                 device_ = a % b;
             }
        else {
            substract = b - a;
            device = b / a;
            device_ = b % a;
            }

        System.out.println("Hieu 2 so cua ba là: " + substract);
        System.out.println("Chia phan nguyen cua 2 so la: " + device);
        System.out.println("Chia phan du cua 2 so la: " + device_);

    }
}

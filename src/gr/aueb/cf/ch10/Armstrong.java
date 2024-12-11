package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int tempNum = number;
        int numDigits = countDigits(number);

        while (tempNum > 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, numDigits);
            tempNum /= 10;
        }

        return sum == number;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}


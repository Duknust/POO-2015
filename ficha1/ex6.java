//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number");
        int number = s.nextInt();
        int fact = factorial(number);
        System.out.println(number + " factorial is " + fact);
    }

    private static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }

}
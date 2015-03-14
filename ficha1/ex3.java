//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < 10; i++) {
            System.out.println("Insert number");
            int lastRead = input.nextInt();
            if (lastRead > max) {
                max = lastRead;
            }
        }
        System.out.println("The highest valor is " + max);
    }

}
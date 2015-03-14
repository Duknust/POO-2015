//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set n");
        int n = input.nextInt();
        System.out.println("Set exp");
        int exp = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert number");
            float number = input.nextFloat();
            System.out.println(number + "^" + exp + "=" + Math.pow(number, exp));
        }
    }

}
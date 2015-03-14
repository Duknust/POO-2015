//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert name:");
        String name = input.next();

        System.out.println("Insert age:");
        int age = input.nextInt();

        System.out.println("Your name is " + name + " and you age is " + age);
    }

}
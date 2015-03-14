//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert 1st number:");
        int stNumber = input.nextInt();
        System.out.println("Insert 2nd number:");
        int ndNumber = input.nextInt();
        System.out.println("Insert 3rd number:");
        int rdNumber = input.nextInt();

        int tmp = -1;

        if (stNumber > ndNumber) {
            tmp = stNumber;
            stNumber = ndNumber;
            ndNumber = tmp;
        }
        if (ndNumber > rdNumber) {
            tmp = ndNumber;
            ndNumber = rdNumber;
            rdNumber = tmp;
        }
        System.out.println(stNumber + " " + ndNumber + " " + rdNumber);
    }

}
//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max = 0;
        int min = Integer.MAX_VALUE;
        boolean stop = false;
        while (!stop) {
            System.out.println("Insert number (positive)");
            int lastNumb = s.nextInt();
            if (lastNumb == -1) {
                stop = true;
                break;
            }
            if (lastNumb > max) {
                max = lastNumb;
            }
            if (lastNumb < min) {
                min = lastNumb;
            }
        }
        System.out.println("The max number is " + max + " and the minimum is " + min + ", the difference is " + (max - min));
    }

}
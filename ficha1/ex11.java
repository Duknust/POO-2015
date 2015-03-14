//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert n");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Insert grade");
            sum += s.nextInt();
        }
        System.out.printf("Avg is %d", sum / n);
    }

}
//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            float radius = s.nextFloat();
            if (radius == 0) {
                stop = true;
            } else {
                double area = Math.PI * Math.pow(radius, 2);
                double perim = 2 * Math.PI * radius;
                System.out.println("Area is " + area + " and perimeter is " + perim);
            }
        }
    }

}
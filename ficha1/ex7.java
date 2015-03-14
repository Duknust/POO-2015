//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fichas {

    public static void main(String[] args) {
        GregorianCalendar begin = new GregorianCalendar();
        int counter = 0;

        for (int i = 0; i < 10000000; i++) {
            counter++;
        }

        GregorianCalendar end = new GregorianCalendar();

        System.out.println("The difference was: " + (end.getTimeInMillis() - begin.getTimeInMillis()));
    }

}
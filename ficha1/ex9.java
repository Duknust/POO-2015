//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert day");
        int day = s.nextInt();
        System.out.println("Insert month");
        int month = s.nextInt();
        System.out.println("Insert year");
        int year = s.nextInt();

        GregorianCalendar base = new GregorianCalendar(1900 - 1, 1 - 1, 1 - 1);
        GregorianCalendar gc = new GregorianCalendar(year - 1, month - 1, day - 1);
        long difference = gc.getTimeInMillis() - base.getTimeInMillis();
        System.out.println("The difference between dates is " + ((((difference / 1000) / 60) / 60) / 24) + " days");
    }

}
//created by duknust
//find in https://github.com/Duknust

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fichas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //need to complete dates
        GregorianCalendar date1 = new GregorianCalendar(0, 0, day1, hour1, minute1, second1);
        GregorianCalendar date2 = new GregorianCalendar(0, 0, day2, hour2, minute2, second2);

        String difference = differenceBetweenDates(date1, date2);

        System.out.println(difference);

    }

    private static String differenceBetweenDates(GregorianCalendar date1, GregorianCalendar date2) {
        long difference = date2.getTimeInMillis() - date1.getTimeInMillis();
        if (difference < 0) {
            difference = 0 - difference;
        }
        return "The difference is " + difference;
    }

}
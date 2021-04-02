import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте , эта программа для определения дня недели по заданной дате.\n" +
                           "Hello, this is a program for determining the day of the week by a given date.");
        System.out.println("");
        Thread.sleep(2000);

        System.out.println("Введите, пожалуйста, день месяца (Например 25),  нажмите \"Enter\".\n" +
                           "Please enter the day of the month (for example 25), press \"Enter\".");

        int day=0;
        boolean daytrue = false;
        while(!daytrue) {
            int dayfalse = scanner.nextInt();
            if (dayfalse < 0 || dayfalse > 31) {
                System.out.println("Ошибка, пожалуйста повторите,день месяца должен быть от 1 до 31. \n" +
                                   "Error, the day of the month must be between 1 and 31.");
            } else {
                day = dayfalse;
                daytrue = true;
            }
        }


        System.out.println("Введите, пожалуйста месяц (например 10), нажмите \"Enter\".\n" +
                           "Please enter the month (for example 10), press \"Enter\".");

        int month = 0;
        boolean monthtrue = false;
        while(!monthtrue) {
            int monthfalse = scanner.nextInt();
            if (monthfalse < 0 || monthfalse > 12) {
                System.out.println("Ошибка, пожалуйста повторите, месяц должен быть от 1 до 12.\n" +
                                   "Error, the month must be from 1 to 12.");
            } else {
                month = monthfalse - 1;
                monthtrue = true;
            }
        }

        System.out.println("Введите, пожалуйста, год полностью (например, 1994) нажмите \"Enter\".\n" +
                           "Please enter a full year (e.g. 1994) click \"Enter\".");

        int year = scanner.nextInt();
        if(year > 100) {
            year = year - 1900;
        }

        Date date = new Date (year, month, day);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY");
        String message = formatter.format(date);
        System.out.print(message + " - ");
        System.out.println(getDayOfWeek(date));
    }



    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        switch(day) {
            case 0 -> result = "этот день - воскресенье.\n" +
                               "this day is sunday.";
            case 1 -> result = "этот день - понедельник.\n" +
                               "this day is monday";
            case 2 -> result = "этот день - вторник.\n" +
                               "this day is tuesday";
            case 3 -> result = "этот день - среда.\n" +
                               "this day is wednesday";
            case 4 -> result = "этот день - четверг.\n" +
                               "this day is thursday";
            case 5 -> result = "этот день - пятница.\n" +
                               "this day is friday";
            case 6 -> result = "этот день - суббота.\n" +
                               "this day is saturday";
        }
        return result;
    }
}

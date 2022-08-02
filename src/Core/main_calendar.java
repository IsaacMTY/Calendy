package Core;

import java.util.Calendar;
import java.util.Scanner;

public class main_calendar{

    public static void main(String[] args) 
    {
        test_Calendar_functions();

        Calendar today = Calendar.getInstance();
        display_current_month(today);
    }

    static void test_Calendar_functions() 
    {
        Calendar c = Calendar.getInstance();
        System.out.printf("" + c.getTime());
    }

    public static void display_current_month(Calendar Right_Now) {
        
    }

}
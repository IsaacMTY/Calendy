package Core;

import java.util.Calendar;

public class main_calendar{

    public static void main(String[] args) 
    {
        // test_Calendar_functions();
        // Calendar today = Calendar.getInstance();
        // display_current_month(today);
        event test_Event = new event();
        while (true) {
            test_Event.change_options();
        }
    }

    static void test_Calendar_functions() 
    {
        Calendar c = Calendar.getInstance();
        System.out.printf("" + c.getTime());
    }

    public static void display_current_month(Calendar Right_Now) {
        
    }

    public int new_event() {
        return 1;
    }

    public int new_group() {
        return 1;
    }

    public int view_group() {
        return 1;
    }

    public int settings() {
        return 1;
    }

}
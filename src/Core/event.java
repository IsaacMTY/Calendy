package Core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class event {
    public static String PROMPT_OPTIONS_EDIT = """
    ---------- Edit Event ----------
    1. Title
    2. Description
    3. Start Date
    4. Start Time
    5. End Date
    6. End Time
    7. Participants""";
    public static String PROMPT_TITLE_CHANGE = "Enter New Title: ";
    public static String PROMPT_DATE_CHANGE = "Enter New Date (MM/DD/YYYY): ";
    public static String PROMPT_TIME_CHANGE = "Enter New Time (HH/MM): ";

    public Calendar start;
    public Calendar end;
    public String title;
    public String description;
    public List<String> participants;

    public event() {
        start = Calendar.getInstance();
        end = Calendar.getInstance(); // change later to make a time difference for the start
        title = new String("Default Title");
        description = new String("Default Description");
        participants = new ArrayList<String>();
    }

    // pick which date to change
    // @return 1, if success
    // @return 0, if invalid input
    // @return -1, if invalid input (not int)
    // @return -2, if input not from range 1-7
    public int change_options (){
        Scanner sca = new Scanner(System.in);
        System.out.println(PROMPT_OPTIONS_EDIT);
        String userInput = sca.nextLine();
        int pickedOption = -1;
        try {
            pickedOption = Integer.parseInt(userInput);
        } catch (NumberFormatException e){
            return -1;
        }
        if (pickedOption == 1) {
            return this.change_title();
        }
        else if (pickedOption == 2) {
            return this.change_description();
        }
        else if (pickedOption == 3) {
            return this.change_start_date();
        }
        else if (pickedOption == 4) {
            return this.change_start_time();
        }
        else if (pickedOption == 5) {
            return this.change_end_date();
        }
        else if (pickedOption == 6) {
            return this.change_end_time();
        }
        else if (pickedOption == 7) {
            return this.change_participants();
        }
        else {
            return -2;
        }
    }

    public int change_title (){
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old title - " + this.title);
        System.out.println(PROMPT_TITLE_CHANGE);
        String userInput = sca.nextLine();
        this.title = userInput;
        System.out.println("TEST: new title - " + this.title);
        return 1;
    }

    public int change_description (){
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old description - " + this.description);
        System.out.println(PROMPT_TITLE_CHANGE);
        String userInput = sca.nextLine();
        this.description = userInput;
        System.out.println("TEST: new title - " + this.description);
        return 1;
    }

    // @return 0, if invalid input provided
    public int change_start_date() { 
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old start date - " + sdf.format(this.start.getTime()));
        System.out.print(PROMPT_DATE_CHANGE);
        String userInput = sca.nextLine();
        // Date newDate = this.string_to_date(userInput);
        // need error checking
        Date newDate = new Date();
        try {
            newDate = sdf.parse(userInput);
            this.start.setTime(newDate);
        } catch (Exception ParseException) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        System.out.println("TEST: new start date - " + sdf.format(this.start.getTime()));
        return 1;
    }

    public int change_start_time (){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old start time - " + sdf.format(this.start.getTime()));
        System.out.print(PROMPT_TIME_CHANGE);
        String userInput = sca.nextLine();
        // Date newDate = this.string_to_date(userInput);
        // need error checking
        Date newTime = new Date();
        try {
            newTime = sdf.parse(userInput);
            this.start.setTime(newTime);
        } catch (Exception ParseException) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        System.out.println("TEST: new start time - " + sdf.format(this.start.getTime()));
        return 1;
    }

    public int change_end_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old end date - " + sdf.format(this.start.getTime()));
        System.out.print(PROMPT_DATE_CHANGE);
        String userInput = sca.nextLine();
        // Date newDate = this.string_to_date(userInput);
        // need error checking
        Date newDate = new Date();
        try {
            newDate = sdf.parse(userInput);
            this.start.setTime(newDate);
        } catch (Exception ParseException) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        System.out.println("TEST: new end date - " + sdf.format(this.start.getTime()));
        return 1;
    }

    public int change_end_time (){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old end time - " + sdf.format(this.start.getTime()));
        System.out.print(PROMPT_TIME_CHANGE);
        String userInput = sca.nextLine();
        // Date newDate = this.string_to_date(userInput);
        // need error checking
        Date newTime = new Date();
        try {
            newTime = sdf.parse(userInput);
            this.start.setTime(newTime);
        } catch (Exception ParseException) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        System.out.println("TEST: new end time - " + sdf.format(this.start.getTime()));
        return 1;
    }

    public int change_participants (){
        return 1;
    }

    public int add_participant (){
        return 1;
    }

    public int remove_participants (){
        return 1;
    }

    // public Date string_to_date(String str){
    //     String parts[] = str.split("/");
    // }

    public int display_event(){
        return 1;
    }
} 

/*
 * TO DO:
 * 1. Add a variable for ids: groups that can see the event
 * 2. Error check to see if end date and time is after start date and time when editing them
 * 3. Initiate an event
 * 4. potential extension on changing specific days, months, years, hours, minutes for interfaces
 */
package Core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;
import java.util.Scanner;

public class event {
    public static String PROMPT_OPTIONS_EDIT = """
    ---------- Edit Event ----------
    1. Title
    2. Description
    3. Start Date
    4. Start Time
    5. End Date
    6. End Time
    7. Participants
    """;
    public static String PROMPT_TITLE_CHANGE = "Enter New Title: ";

    
    public Calendar start;
    public Calendar end;
    public String title;
    public String description;
    public List<String> participants;

    public event() {
        start = Calendar.getInstance();
        end = Calendar.getInstance(); // change later to make a time difference for the start
        title = new String("");
        description = new String("");
        participants = new LinkedList<String>();
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
        System.out.println("TEST: old title - " + title);
        System.out.println(PROMPT_TITLE_CHANGE);
        String userInput = sca.nextLine();
        title = userInput;
        System.out.println("TEST: new title - " + title);
        return 1;
    }

    public int change_description (){
        Scanner sca = new Scanner(System.in);
        System.out.println("TEST: old title - " + title);
        System.out.println(PROMPT_TITLE_CHANGE);
        String userInput = sca.nextLine();
        title = userInput;
        System.out.println("TEST: new title - " + title);
        return 1;
    }

    public int change_start_date() {

        return 1;
    }

    public int change_start_time (){
        return 1;
    }

    public int change_end_date() {
        return 1;
    }

    public int change_end_time (){
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
} 

/*
 * TO DO:
 * 1. Add a variable for ids: groups that can see the event
 * 2. Error check to see if end date and time is after start date and time when editing them
 */
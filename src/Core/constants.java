package Core;

public final class constants {
    private constants() {} //restrict instantiation

    String[] months = {
        "",                               // leave empty so that we start with months[1] = "January"
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

}

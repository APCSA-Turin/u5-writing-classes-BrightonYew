package U5T7_Static_Methods_Variables;

public class study_Helper {
    private static int totalhours = 0;
    private int hourstoday;
    private int highesthour;

    public study_Helper() {
        hourstoday = 0;
        highesthour = 0;
    }

    public void loginToday(int hours) {
        hourstoday = hours;
        totalhours += hours;
        if (hourstoday > highesthour) {
            highesthour = hourstoday;
        }
        System.out.println("You studied for " + hourstoday + " hours today");
        System.out.println("You have studied for a total time of " + totalhours + " hours");
        System.out.println("The longest you spend studying in one day was " + highesthour + " hours. Lets break that!");
    }
}

package U5T7_Static_Variables;

public class Student {
    private String firstName;
    private int points;
    private static int totalPointsEarned = 0;
    private static int greatestPoints;

    public Student(String firstName) {
        this.firstName = firstName;
        points = 0;
    }

    public String studentInfo() {
        String str = "Student: " + firstName;
        str += "\nStudent's Points: " + points;
        return str;
    }

    public void addPoints(int points) {
        this.points += points;
        totalPointsEarned += points;
        if (this.points > greatestPoints) {
            greatestPoints = this.points;
        }
    }

    public int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        String str = "Total points earned by all students: " + totalPointsEarned;
        str += "\nMost points earned by any student: " + greatestPoints;
        return str;
    }

}
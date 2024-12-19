package U5T7_Static_Variables;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;


    private static int mostRecentEmployeeID = 100;
    private static int totalEmployees = 0;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        employeeID = mostRecentEmployeeID + 1;
        mostRecentEmployeeID++;
        totalEmployees++;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }


    public int getID() {
        return employeeID;
    }


    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }


    public static int getTotalEmployeesCreated() {
        return totalEmployees;
    }


    public String employeeInfo() {
        String str = "--------------------------";
        str += "\nEmployee full name: " + getFullName();
        str += "\nEmployee ID: " + employeeID;
        str += "\nMost recent ID assigned: " + mostRecentEmployeeID;
        str += "\nTotal employees hired: " + totalEmployees;
        str += "\n--------------------------";
        return str;
    }
}

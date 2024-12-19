public class Person {
    private String firstname;
    //private String lastname;
    private int meetingnum;
    public Person (String firstname, String lastname) {
        this.firstname = firstname;
        //this.lastname = lastname;
        meetingnum = 0;
    }
    public void setMeeting(int num) {
        meetingnum = num;
    }

    public int getMeetings() {
        return meetingnum;
    }

    public String getFirstName () {
        return firstname;
    }

    public void meet(Person person2) {
        System.out.println("Hello, my name is " + firstname);
        System.out.println("Hi, my name is " + person2.getFirstName());
        meetingnum++;
        person2.setMeeting(person2.getMeetings() + 1);
    }

}

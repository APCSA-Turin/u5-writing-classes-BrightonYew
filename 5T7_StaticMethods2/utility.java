public class utility {


    private utility() {}


    public static double feettoMeters(double feet) {
        return (feet * 0.3048);
    }

    public static double meterstoFeet(double meters) {
        return (meters * 3.28084);
    }

    private static String sideInfo(double length, double width, double height, String unit) {
        String str = "\nThe length is: " + length + " " + unit;
        str += "\nThe width is: " + width + " " + unit;
        str += "\nThe height is: " + height + " " + unit + "\n";
        return str;
    }


    public static void otherUnit (double length, double width, double height, String unit) { //prints info with the current unit, then switches to the other and prints its info
        System.out.print("Current unit: " + unit);
       System.out.println(sideInfo(length, width, height, unit));
       double newlength;
       double newwidth;
       double newheight;
       if (unit.equals("feet")) {
            newlength = feettoMeters(length);//A
            newwidth = feettoMeters(width);//A
            newheight = feettoMeters(height);//A
            System.out.print("Now switching to meters");
            System.out.println(sideInfo(newlength, newwidth, newheight, "meters")); //A
       } else {
            newlength = meterstoFeet(length);//A
            newwidth = meterstoFeet(width);//A
            newheight = meterstoFeet(height);//A
            System.out.print("Now switching to feet");
            System.out.println(sideInfo(newlength, newwidth, newheight, "feet"));//A
       }
    }

    public static void main(String[] args) {
        otherUnit(10, 15, 20, "meter");

    }
}


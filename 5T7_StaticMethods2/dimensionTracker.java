public class dimensionTracker {
    private double length;
    private double width;
    private double height;
    private String unit;

    public dimensionTracker(int length,int width,int height, String unit) {
        this.length = length;
        this.width = width;
        this.height = height;
        if (unit.equals("feet")) {
            this.unit = "feet";
        } else {
            this.unit = "meters";
        }

    }

    private void dimensionInfo() {
        utility.otherUnit(length, width, height, unit); //B //E
    }

    public static boolean willFitinPackage (double length,double width,double height, String unit) {
        if (unit.equals("meters")) {
            length = utility.meterstoFeet(length);//E
            width = utility.meterstoFeet(width);//E
            height = utility.meterstoFeet(height);//E
        }
        if (length > 5 || length > 5 || height > 5) {
            return false;
        } else {
            return true;
        }
    }

    public void printinfo() {
        if (!willFitinPackage(length, width, height, unit)) {//D //C
            System.out.println("This object is too big!");
        } else {
            System.out.println("You are able to deliver this package");
        }

    }

    public static void main(String[] args) {
        dimensionTracker test = new dimensionTracker(10, 1, 1,"feet");
        test.printinfo();
    }
}

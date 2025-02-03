public class Box {
    private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        // implement me as described in part (a)
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        // implement me as described in part (b)
        this(side, side, side);
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double volume() {
        // implement me as described in part (c)
        return length * height * width;
    }
    
    public Box greaterVolume(Box otherBox) {
        // implement me as described in part (d)
        double volume1 = volume();
        double volume2 = otherBox.volume();
        if (volume1 > volume2) {
            return this;
        } else if (volume2 > volume1) {
            return otherBox;
        } else {
            return null;
        }
    }

    public String boxInfo() {
        // implement me as described in part (e)
        return InfoString.boxInfoString(this);
    }

    public void addToShape(Shape s) {
        // implement me as described in part (f)
        s.attachBox(this);
    }

    public class InfoString {
        public static String boxInfoString(Box box) {
            String str = "Length: " + box.getLength();
            str += "\nWidth: " + box.getWidth();
            str += "\nHeight: " + box.getHeight();
            return str;
        }
    }

    public class Shape {

        private Box box;
    
        public Shape() { }
    
        public Box getBox() {
            return box;
        }
    
        public void attachBox(Box box) {
            this.box = box;
        }
    }
    
    
}

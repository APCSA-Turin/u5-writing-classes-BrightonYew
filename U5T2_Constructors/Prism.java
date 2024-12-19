package U5T2_Constructors;

public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism (int length) {
        this.length = length;
        width = length;
        height = length;
    }

    public Prism () {
        length = (int)(Math.random() * 91) + 10;
        width = (int)(Math.random() * 91) + 10;
        height = (int)(Math.random() * 91) + 10;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String dimensions () {
        String str = "Length = " + length + "\n";
        str += "Width = " + width + "\n";
        str += "Height = " + height + "\n";
        return str;
    }

    public int volume () {
        return length * width * height;
    }

    public int surfaceArea () {
        int top = length * width * 2;
        int side1 = length * height * 2;
        int side2 = width * height * 2;
        return top + side1 + side2;
    }
}
 

package U5T2_Constructors;

public class Square {
    private int side;
    private String name;

    public Square () {
        name = "";
        side = 10;
    }
  
    public int getSide() {
      return side;
    }
  
    public String getName() {
      return name;
    }
  
    public String info() {
      return "side: " + side + ", name: " + name;
    }
  }
  

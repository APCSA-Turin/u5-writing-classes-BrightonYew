package U5T7_Static_Methods_Variables;

public class Nums {
    private int int1;
    private int int2;
    private int timesUsed;
    public static int totalTimesUsed = 0;

    public Nums(int int1,int int2) {
        this.int1 = int1;
        this.int2 = int2;
        timesUsed = 0;
    }

    public int randBetween() {
        totalTimesUsed++;
        timesUsed++;
        return ((int)(Math.random() * (int2 - int1)) + int1);
    }

    public int getRandomNumsGenerated() {
        return timesUsed;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalTimesUsed;
    }
}
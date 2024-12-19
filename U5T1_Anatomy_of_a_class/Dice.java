public class Dice {
    private int numofsides;
    private int rolloutcome;
    private int rollcount;

    public Dice(int sides) {
        numofsides = sides;
        rollcount = 0;
        rolloutcome = 0;
    }

    public void roll () {
        rolloutcome = (int)(Math.random() * numofsides) + 1;
        rollcount++;
    }

    public void setSides (int sides) {
        numofsides = sides;
    }

    public int getRollValue() {
        return rolloutcome;
    }

    public int getRollCount() {
        return rollcount;
    }

    public int getSides() {
        return numofsides;
    }
}
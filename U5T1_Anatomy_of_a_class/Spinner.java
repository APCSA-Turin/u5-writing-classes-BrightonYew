public class Spinner {
    private int spinValue;
    private int sections;
    private int spinCount;
    private int spinSum;

    public Spinner (int sections) {
        this.sections = sections;
        spinCount = 0;
        spinSum = 0;
        spinValue = 0;
    }

    public void spin() {
        spinValue = (int)(Math.random() * sections) + 1;
        spinSum += spinValue;
        spinCount++;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public double averageSpin() {
        return (double) spinSum / spinCount;
    }
}

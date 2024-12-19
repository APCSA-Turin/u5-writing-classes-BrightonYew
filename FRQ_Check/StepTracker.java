public class StepTracker {
    private int minSteps;
    private int activeDays;
    private int days;
    private int steps;

    public StepTracker (int minSteps) {
        this.minSteps = minSteps;
        activeDays = 0;
        steps = 0;    
        days = 0;
    }

    public void addDailySteps(int steps) {
        this.steps += steps;
        days++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) {
            return 0;
        }
        return (double)steps / days;
    }

}

public class AdditionPattern {
    private int startingNum;
    private int subsequentAddends;
    private int currentNum;

    public AdditionPattern (int startingNum, int subsequentAddends) {
        this.startingNum = startingNum;
        this.subsequentAddends = subsequentAddends;
        currentNum = startingNum;
    }

    public int currentNumber() {
        return currentNum;
    }

    public void next() {
        currentNum += subsequentAddends;
    }

    public void prev() {
        if (currentNum - subsequentAddends >= startingNum) {
            currentNum -= subsequentAddends;
        }
    }

}

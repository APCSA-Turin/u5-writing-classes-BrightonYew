public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    public Temperature(double highTemp, double lowTemp, String tempScale) {
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        if (tempScale.equals("C")) {
            this.tempScale = "C";
        } else {
            this.tempScale = "F";
        }
    }


    public static double convertCtoF(double temp) {
        return ((temp * 1.8) + 32);
    }

    public static double convertFtoC(double temp) {
        return ((temp - 32) / 1.8);
    }

    public void updateCtoF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    public void updateFtoC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }

    public String tempInfo() {
        String str = "High Temperature: " + highTemp + " " + tempScale;
        str += "\nLow Temperature: " + lowTemp + " " + tempScale;
        return str;
    }
}

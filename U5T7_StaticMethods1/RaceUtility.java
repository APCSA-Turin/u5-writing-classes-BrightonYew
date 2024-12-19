public class RaceUtility {
    public RaceUtility() { }
    public static double milesToKm(double miles) {
        return (miles * 1.6);
    }

    public static double kmToMiles(double km) {
        return (km * 0.62137);
    }

    public static String makeProper(String str) {
        str = str.toLowerCase();
        String firstChar = str.substring(0,1);
        firstChar = firstChar.toUpperCase();
        String firstCharRemoved = str.substring(1);
        return firstChar + firstCharRemoved;
    }
}

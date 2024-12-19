import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the width");
        int width = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the height");
        int height = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the unit");
        String unit = scan.nextLine();

        utility.otherUnit(length, width, height, unit);

        dimensionTracker test = new dimensionTracker(length, width, height, unit);
        test.printinfo();

    }

}
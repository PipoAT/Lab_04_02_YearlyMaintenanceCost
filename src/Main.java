// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // define variables for each season and define/init with the costs
        double costSummer = 2023.05;
        double costFall = 2003.05;
        double costWinter = 2026.04;
        double costSpring = 2025.05;
        double yearMaintenanceCost = 0;

        // calculate the total maintenance costs for the entire year
        yearMaintenanceCost = costSummer + costFall + costWinter + costSpring;

        // output the cost for each season
        System.out.println("The maintenance cost for the summer season (in USD) is: " + costSummer);
        System.out.println("The maintenance cost for the fall season (in USD) is: " + costFall);
        System.out.println("The maintenance cost for the winter season (in USD) is: " + costWinter);
        System.out.println("The maintenance cost for the spring season (in USD) is: " + costSpring);

        // output the total cost for the whole year
        System.out.println("The yearly maintenance cost (in USD) is: " + yearMaintenanceCost);
    }
}
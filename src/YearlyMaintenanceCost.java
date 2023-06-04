public class YearlyMaintenanceCost
{
    public static void main(String[] args) {
    double springCost = 150.25;
    double summerCost = 250.25;
    double autumnCost = 125.25;
    double winterCost = 175.25;
    double yearlyCost = 0;
    yearlyCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println("The cost of maintenance for the year is:" + " " + "$" + yearlyCost);

    }
}
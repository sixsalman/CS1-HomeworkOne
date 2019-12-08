import java.util.Scanner; //scanner utility imported

/**
 Author: Salman

 This program takes days per week on which the user wishes to commute,
 the number of weeks the semester will last, average mpg of the car and
 price of gas; calculates cost for one person riding alone; calculates
 total cost is the ride is shared and outputs all the inputs, intermediate
 results and total costs for all three scenarios.
 */
public class HomeworkOne {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputs are printed to the console here.
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in); // new scanner created
        System.out.print("Enter no. of days per semester: ");
        int days = kbd.nextInt(); // no. of days per week obtained from the user
        System.out.print("Enter no. of weeks per semester: ");
        int weeks = kbd.nextInt(); // no. of weeks obtained from the user
        System.out.print("Enter Average MPG: ");
        double mpg = kbd.nextFloat(); // mpg obtained from the user
        System.out.print("Enter Price per gallon: ");
        double price = kbd.nextFloat(); // price per gallon obtained from user
        System.out.print("Enter 1-way distance: ");
        double distance = kbd.nextFloat(); // one way distance obtained from user
        double cost = price*2.0*distance*weeks*days/mpg; // total cost for a single person riding calculated

        System.out.printf("\n>>> RIDE SHARE APP <<<\n\nInput data from user\n---------------------\n"
                        + "Class meetings: %d weeks/semester, %d days/week\nGas price: $%.2f per gallon\n"
                        + "Car efficiency: averages %.0f mpg\nDistance (home to CEAS): %.0f miles 1-way\n"
                        + "\nIntermediate results\n----------------------\nNumber round trips/semester: %d\n"
                        + "Total miles/semester: %.0f\nGas cost:\n\tfor 1 round-trip: $%.2f\n\ttotal for semester: $%.2f\n\n"
                        + "Cost for the semester\n----------------------------\n",weeks,days,price,mpg,distance,weeks*days,
                2.0*weeks*days*distance,cost/(weeks*days),cost); // intermediate results calculated and displayed along with the values obtained from user

        System.out.printf("1 person alone: $%.2f\n2 people sharing: $%.2f (per person)"
                + "\n3 people sharing: $%.2f (per person)\n", cost,cost/2.0,cost/3.0); // cost for all three situations displayed
        kbd.close(); // scanner closed
    }
}

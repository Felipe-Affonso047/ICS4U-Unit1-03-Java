/*
* The "Microwave" program calculates the time to heat food.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-11-22
*/

import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class Microwave {
    /**
    * Created constants.
    */
    public static final double PIZZA_TIME = 45.0;
    /**
    * Created constants.
    */
    public static final double SUB_TIME = 60.0;
    /**
    * Created constants.
    */
    public static final double SOUP_TIME = 105.0;
    /**
    * Created constants.
    */
    public static final double AMOUNT_TWO = 1.5;
    /**
    * Created constants.
    */
    public static final double AMOUNT_THREE = 2.0;
    /**
    * Created constants.
    */
    public static final int SEC_IN_MIN = 60;
    /**
    * Created constants.
    */
    public static final int TWO = 2;
    /**
    * Created constants.
    */
    public static final int THREE = 3;
    /**
    * Created constants.
    */
    public static final int ONE = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the function of the food type.
     *
     * @param foodType is good
     * @return = is the time each food takes to heat.
     */
    static double food(final String foodType) {
        // https://www.w3schools.com/java/java_conditions.asp
        final double ret;
        double foodTime = 0.0;
        if ("pizza".equals(foodType) || "Pizza".equals(foodType)) {
            foodTime = PIZZA_TIME;
            ret = foodTime;
        } else if ("soup".equals(foodType) || "Soup".equals(foodType)) {
            foodTime = SOUP_TIME;
            ret = foodTime;
        } else if ("sub".equals(foodType) || "Sub".equals(foodType)) {
            foodTime = SUB_TIME;
            ret = foodTime;
        } else {
            System.out.println("\nPlease insert one of the 3 types of food");
            System.exit(0);
            ret = foodTime;
        }
        return ret;
    }

    /**
     * This is the function of the amount of food.
     *
     * @param amountOfFood is good
     * @return = is the amount of increase.
     */
    static double amount(final int amountOfFood) {
        final double ret;
        if (amountOfFood == ONE) {
            ret = amountOfFood;
        } else if (amountOfFood == TWO) {
            ret = AMOUNT_TWO;
        } else if (amountOfFood == THREE) {
            ret = AMOUNT_THREE;
        } else {
            System.out.println("\nPlease, insert an integer between 1 and 3");
            System.exit(0);
            ret = 0.0;
        }
        return ret;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            // get the logs length
            // code from https://www.w3schools.com/java/java_user_input.asp
            final Scanner input = new Scanner(System.in);
            // https://www.w3schools.com/java/java_methods_param.asp
            System.out.println(
                "What food are you heating up? Soup, sub or pizza?"
            );
            final String typeOfFood = input.nextLine();
            final double timePerFood = food(typeOfFood);

            System.out.println("How many do you want to heat up? (max 3)");
            final int amountOfFood = input.nextInt();
            final double timePerAmount = amount(amountOfFood);

            final double timeOfHeating = timePerAmount * timePerFood;
            final int minutes = (int) (timeOfHeating / SEC_IN_MIN);
            final double seconds = timeOfHeating % SEC_IN_MIN;

            System.out.println("\nYour food is going to be heated up for "
                + minutes + " min and " + seconds + " seconds."
            );
        } catch (java.util.InputMismatchException error) {
            System.out.println("\nThere was an error: " + error);
        }
        System.out.println("\nDone.");
    }
}

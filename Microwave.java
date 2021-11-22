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
    public static final double LIGHT_SPEED = 2.998;

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
     */
    static void FoodType(String foodType) {

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
            System.out.println(
                "Insert the mass of the object in Kg:"
            );

            final double mass = input.nextFloat();
            final double energy = mass * LIGHT_SPEED * LIGHT_SPEED;

            System.out.println(
                "\nThe amount of energy the object would produce is: "
                + energy + "x10^16 joules"
            );
        }
        catch (java.util.InputMismatchException error) {
            System.out.println("\nThere was an error: " + error);
        }
        System.out.println("\nDone.");
    }
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadInput {
    private static Scanner scn = new Scanner(System.in);

    public static List<Double> getCarportDimensions(){
        List<Double> dimensions = new ArrayList<>();
        double width = 0;
        double height = 0;
        double length = 0;

        do {
            displayMessage("Please fill out following dimensions of your carport:");
            width = getDoubleInput("Width: ");
            height = getDoubleInput("Height: ");
            length = getDoubleInput("Length: ");
        } while (width <= 0 || height <= 0 || length <= 0);

        clearConsole();
        displayMessage("You have chosen the following dimensions:\n" +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nLength: " + length + "\n");
        dimensions.add(width);
        dimensions.add(height);
        dimensions.add(length);
        return dimensions;
    }

    private static void displayMessage(String msg){
        System.out.println(msg);
    }
    private static void displayMessageLine(String msg){
        System.out.print(msg);
    }
    private static double getDoubleInput(String msg){
        while(true) {
            displayMessageLine(msg);
            try {
                double input = Double.parseDouble(scn.next());
                if (input <= 0){
                    throw  new InputMismatchException("Please enter a positive number.");
                }
                return input;
            } catch (NumberFormatException NFE) {
                displayMessage("Please enter a valid number.");
            } catch (InputMismatchException IME){
                displayMessage(IME.getMessage());
            }
        }
    }

    public static void clearConsole(){
        for (int i = 0; i < 20; i++){
            System.out.println(" ");
        }

    }
}

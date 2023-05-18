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
            displayMessage("Venligst indtast målene på din carport (mm):");
            width = getDoubleInput("Bredde: ");
            height = getDoubleInput("Højde: ");
            length = getDoubleInput("Længde: ");
        } while (width <= 0 || height <= 0 || length <= 0);

        clearConsole();
        displayMessage("Du har valgt følgende dimensioner:\n" +
                "\nBredde: " + width +
                "\nHøjde: " + height +
                "\nLængde: " + length + "\n");
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
                    throw  new InputMismatchException("Venligst indtast et positivt tal.");
                }
                return input;
            } catch (NumberFormatException NFE) {
                displayMessage("Venligst indtast et gyldigt tal.");
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

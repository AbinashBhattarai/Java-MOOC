package FlightControl;

import java.util.Scanner;

import FlightControl.logic.AirControl;
import FlightControl.ui.TextUI;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);

        AirControl airControl = new AirControl();
        TextUI ui = new TextUI(scanner, airControl);
        ui.start();
    }
}

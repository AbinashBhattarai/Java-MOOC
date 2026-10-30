package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import FlightControl.logic.AirControl;

public class TextUI {
    private Scanner scanner;
    private AirControl airControl;
    
    public TextUI(Scanner scanner, AirControl airControl) {
        this.scanner = scanner;
        this.airControl = airControl;
    }

    public void start() {
        System.out.println("Airport Asset Control");
        startAssetControl();
        System.out.println("");

        System.out.println("Flight Control");
        startFlightControl();
        System.out.println("");
    }

    private void startAssetControl() {
        while (true) {
            System.out.print("Choose an action:\n" +
                            "[1] Add an airplane\n" +
                            "[2] Add a flight\n" +
                            "[x] Exit Airport Asset Control\n" +
                            "> "
            );

            String input = this.scanner.nextLine();
    
            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            }
        }

    }

    private void addPlane() {
        System.out.print("Give the airplane id: ");
        String ID = this.scanner.nextLine();

        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(this.scanner.nextLine());

        this.airControl.addPlane(ID, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        String ID = this.scanner.nextLine();

        if (this.airControl.getAirplane(ID) == null) {
            System.out.println("Enter valid plane");
            return;
        }

        System.out.print("Give the departure airport id: ");
        String departure = this.scanner.nextLine();

        System.out.print("Give the target airport id: ");
        String target = this.scanner.nextLine();

        this.airControl.addFlight(ID, departure, target);            
    }

    private void startFlightControl() {
        while (true) {
            System.out.print("Choose an action:\n" +
                            "[1] Print airplanes\n" +
                            "[2] Print flights\n" +
                            "[3] Print airplane details\n" +
                            "[x] Quit\n" +
                            "> "
            );

            String input = this.scanner.nextLine();
    
            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneDetails();
            }
        }
    }

    private void printPlanes() {
        for (Plane plane : this.airControl.printPlanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : this.airControl.printFlights()) {
            System.out.println(flight);
        }
    }

    private void printPlaneDetails() {
        System.out.println("Give the airplane id: ");
        String ID = this.scanner.nextLine();
        if (this.airControl.getAirplane(ID) == null) {
            System.out.println("Enter valid plane");
        } else {
            System.out.println(this.airControl.getAirplane(ID));
        }
    }
}

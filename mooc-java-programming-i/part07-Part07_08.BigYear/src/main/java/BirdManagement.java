import java.util.ArrayList;
import java.util.Scanner;

public class BirdManagement {
    private ArrayList<Bird> birds;
    private Scanner scan;

    public BirdManagement(Scanner scan) {
        this.birds = new ArrayList<>();
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("All")) {
                printAll();
            } else if (command.equals("One")) {
                printOne();
            } 
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = this.scan.nextLine();
        
        System.out.print("Name in Latin: ");
        String latinName = this.scan.nextLine();

        this.birds.add(new Bird(name, latinName));
    }

    public void observation() {
        System.out.print("Bird? ");
        String name = this.scan.nextLine();

        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.setObservationCount(1);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printOne() {
        System.out.print("Bird? ");
        String name = this.scan.nextLine();

        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        // BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        // coffeeBox.add(new Item("Saludo", 5));
        // coffeeBox.add(new Item("Pirkka", 5));
        // coffeeBox.add(new Item("Kopi Luwak", 5));

        // System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        // System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        // System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        // OneItemBox box = new OneItemBox();
        // box.add(new Item("Saludo", 5));
        // box.add(new Item("Pirkka", 5));

        // System.out.println(box.isInBox(new Item("Saludo")));
        // System.out.println(box.isInBox(new Item("Pirkka")));
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("AAA", 5));
        items.add(new Item("BBB", 5));
        items.add(new Item("CCC", 5));
        items.add(new Item("DDD", 5));
        items.add(new Item("EEE", 5));

        Box box1 = new BoxWithMaxWeight(10);
        Box box2 = new OneItemBox();
        Box box3 = new MisplacingBox();

        box1.add(items);
        box2.add(items);
        box3.add(items);

        System.out.println("BoxWithMaxWeight:\n" + box1);
        System.out.println("OneItemBox:\n" + box2);
        System.out.println("MisplacingBox:\n" + box3);
    }
}

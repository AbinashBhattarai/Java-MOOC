
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String returnElements() {
        String returnElements = "";
        for (String element : elements) {
            returnElements += "\n" + element;
        }
        return returnElements;
    }
    
    @Override 
    public String toString() {
        String genericMsg = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return genericMsg + " is empty.";
        }

        String elementMsg = "";
        if (this.elements.size() <= 1) {
            elementMsg = " element:";
        } else {
            elementMsg = " elements:";
        }

        String contentMsg = returnElements();
        return genericMsg + " has " + this.elements.size() + elementMsg + contentMsg;
    }
}

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationList;

    public Abbreviations() {
        this.abbreviationList = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationList.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationList.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationList.get(abbreviation);
    }
}

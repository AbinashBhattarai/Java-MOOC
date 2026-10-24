import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DictionaryOfManyTranslations {
    private HashMap<String, List<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return new ArrayList<>(this.translations.getOrDefault(word, new ArrayList<>()));
    }

    public void remove(String word) {
        this.translations.remove(word);
    }
}

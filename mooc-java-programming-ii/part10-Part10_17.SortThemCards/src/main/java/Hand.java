import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream() 
                    .forEach(c -> System.out.println(c));
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void sortBySuit() {
        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);
    }

    private int getSum() {
        return this.cards.stream()
                        .mapToInt(c -> c.getValue())
                        .sum();
    }

    @Override
    public int compareTo(Hand hand) {
        return Integer.compare(this.getSum(), hand.getSum());
    }
}

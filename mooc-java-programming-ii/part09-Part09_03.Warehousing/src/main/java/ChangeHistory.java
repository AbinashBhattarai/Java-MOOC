import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.history);
    }

    public double minValue() {
        if (!this.history.isEmpty()) {
            return Collections.min(this.history);
        }
        return 0.0;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Double item : this.history) {
            sum += item;
        }

        return sum / this.history.size();
    }
}

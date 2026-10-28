
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyRate> rates = new ArrayList<>();
        try {
            rates = Files.lines(Paths.get("literacy.csv"))
                        .map(l -> l.split(","))
                        .map(l -> new LiteracyRate(
                                l[0], 
                                l[1], 
                                l[2].replace("(%)", "").trim(), 
                                l[3], 
                                Integer.valueOf(l[4]), 
                                Double.valueOf(l[5])
                            ))
                        .toList();
        } catch (Exception e) {
            // TODO: handle exception
        }

        rates.stream().sorted((r1, r2) -> 
            { 
                return Double.compare(r1.getPercent(), r2.getPercent());
            }).forEach(r -> System.out.println(r));
    }
}

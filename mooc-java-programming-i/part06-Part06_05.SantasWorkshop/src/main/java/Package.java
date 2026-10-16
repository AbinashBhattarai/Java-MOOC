import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftPackages;

    public Package() {
        this.giftPackages = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.giftPackages.add(gift);
    }

    public int totalWeight() {
        int giftPackagesWeight = 0;

        for (Gift gift : this.giftPackages) {
            giftPackagesWeight += gift.getWeight();
        }
        
        return giftPackagesWeight;
    }
}

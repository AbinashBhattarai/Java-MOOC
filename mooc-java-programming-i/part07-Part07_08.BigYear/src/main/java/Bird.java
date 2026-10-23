public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setObservationCount(int observation) {
        this.observationCount += observation;
    }

    public int getObservationCount() {
        return this.observationCount;
    }

    @Override 
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}
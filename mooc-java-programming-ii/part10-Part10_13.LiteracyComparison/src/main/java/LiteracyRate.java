public class LiteracyRate {
    private String theme;
    private String ageGrp;
    private String gender;
    private String country;
    private int year;
    private double percent;

    public LiteracyRate(String theme, String ageGrp, String gender, String country, int year, double percent) {
        this.theme = theme;
        this.ageGrp = ageGrp;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }

    public double getPercent() {
        return this.percent;
    }

    @Override 
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
}
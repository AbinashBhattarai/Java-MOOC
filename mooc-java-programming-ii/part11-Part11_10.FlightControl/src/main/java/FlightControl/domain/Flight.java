package FlightControl.domain;

public class Flight {
    private Plane airplane;
    private Place departureID;
    private Place targetID;

    public Flight(Plane airPlane, Place departureID, Place targetID) {
        this.airplane = airPlane;
        this.departureID = departureID;
        this.targetID = targetID;
    }

    @Override 
    public String toString() {
        return this.airplane + " (" + this.departureID + "-" + this.targetID + ")";
    }
}

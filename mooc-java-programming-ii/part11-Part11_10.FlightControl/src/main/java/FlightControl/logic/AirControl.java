package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;

public class AirControl {
    private Map<String, Plane> airplanes;
    private Map<String, Place> places;
    private Map<String, Flight> flights;

    public  AirControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addPlane(String ID, int capacity) {
        Plane airplane = new Plane(ID, capacity);
        this.airplanes.put(ID, airplane);
    }

    public void addFlight(String airplane, String departure, String target) {
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(target, new Place(target));

        Flight flight = new Flight(this.airplanes.get(airplane), this.places.get(departure), this.places.get(target));
        this.flights.put(flight.toString(), flight);
    }

    public Plane getAirplane(String ID) {
        if(this.airplanes.containsKey(ID)) {
           return this.airplanes.get(ID); 
        }
        return null;
    }

    public Collection<Plane> printPlanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> printFlights() {
        return this.flights.values();
    }
}

package PortManagement;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Trip implements TripInterface{
    private String ID;
    private LocalDateTime departTime;
    private LocalDateTime arrivalTime;
    private Port from;
    private Port to;
    private double estimatedFuel;
    private Vehicle vehicle;
    private Container container;

    private TripStatus currentStatus;
    private enum TripStatus {
//        CANCELED,
        ONGOING,
        CANCELED, COMPLETED
    };
    public static TreeMap<String, Trip> allTrip = new TreeMap<>();
    private static int idCounter;


    public Trip() {
        if (!allTrip.isEmpty()) {
            String lastKey = allTrip.lastKey();
            idCounter = Integer.parseInt(lastKey.substring(4));

        } else
            idCounter = 100;
        this.ID = "Trip" + (++idCounter);
        currentStatus = TripStatus.ONGOING;
        allTrip.put(this.ID, this);
    }

    public Trip(String ID, LocalDateTime departTime, LocalDateTime arrivalTime, Port from, Port to, double estimatedFuel, Vehicle vehicle, Container container) {
        this.ID = ID;
        this.departTime = departTime;
        this.arrivalTime = arrivalTime;
        this.from = from;
        this.to = to;
        this.estimatedFuel = estimatedFuel;
        this.vehicle = vehicle;
        this.container = container;
        if (arrivalTime==null){
            this.currentStatus = TripStatus.ONGOING;
        }else{  currentStatus = TripStatus.COMPLETED;}

        allTrip.put(this.ID, this);
            }

    public void getTripsBetweenDates(LocalDateTime startDate, LocalDateTime endDate) {
        for (Trip trip : allTrip.values()) {
            if ((trip.departTime.isAfter(startDate) || trip.departTime.isEqual(startDate)) &&
                    (trip.arrivalTime.isBefore(endDate) || trip.arrivalTime.isEqual(endDate))) {
                System.out.println(trip);
    }
        }
    }

    public void listAllTripHappeningAt(LocalDateTime inputTime){
//        !!!
        for (Map.Entry<String, Trip> entry : Trip.allTrip.entrySet()) {
            Trip trip = entry.getValue();
            if (!inputTime.isBefore(trip.departTime) && !inputTime.isAfter(trip.arrivalTime)) {
                System.out.println("Trip ID: " + trip.ID);
                System.out.println("Trip ID: " + trip.ID + " is happening at " + inputTime);

            }

        }}
    public void setDistanceAuto(){
        double distance = from.calculateDistance(to);
        if (vehicle.getType().equals("ship")) {
            estimatedFuel = distance * container.getShipFuelWeightKm();
        } else {
            estimatedFuel = distance * container.getTruckFuelWeightKm();
        }

    }
    //!!!
    public void startNewTrip(){
            departTime=LocalDateTime.now();
            vehicle.moveTo(null);
            currentStatus=TripStatus.ONGOING;
    }

    public void completeTrip(){
        // Unload the Container from the Vehicle
        this.vehicle.moveTo(to);

        // Set the status of the trip to "completed"
        this.currentStatus = TripStatus.COMPLETED;
        //add current time
        this.arrivalTime = LocalDateTime.now();

    }
    public static ArrayList<Trip> getAllTripAsList(){
        return new ArrayList<>(allTrip.values());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDateTime getDepartTime() {
        return departTime;
    }

//    !!! the name of time variable
    public void setDepartTime(LocalDateTime departTime) {

        this.departTime = departTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Port getFrom() {
        return from;
    }

    public void setFrom(Port from) {
        this.from = from;
    }

    public Port getTo() {
        return to;
    }

    public void setTo(Port to) {
        this.to = to;
    }

    public double getEstimatedFuel() {
        return estimatedFuel;
    }

    public void setEstimatedFuel(double estimatedFuel) {
        this.estimatedFuel = estimatedFuel;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        // Calculate the distance between the two ports
        this.vehicle = vehicle;
        // Calculate the estimated fuel based on the type of vehicle and the distance

    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public TripStatus getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus(TripStatus currentStatusStatus) {
        this.currentStatus = currentStatus;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static TreeMap<String, Trip> getAllTrip() {
        return allTrip;
    }


    @Override
    public String toString() {
        return "Trip{" +
                "ID='" + ID + '\'' +
                ", departTime=" + departTime +
                ", arrivalTime=" + (arrivalTime == null ?  "N/A":arrivalTime) +
                ", from=" + from +
                ", to=" + to +
                ", estimatedFuel=" + estimatedFuel +
                ", vehicle=" + vehicle +
                ", container=" + container +
                ", currentStatus=" + currentStatus +
                '}';
    }
}
package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cruise {

    private Boat boat;

    private LocalDate sailing;

    private double basicPrice;

    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger){
        //: egy foglalás. Ellenőrizni kell, hogy van-e még elég hely.
        if (getPassengers().size()<200){
            passengers.add(passenger);
        }else {
            throw new IllegalStateException("Nincs elég hely a 200 fős hajón!");
        }
    }
/*
    public double getPriceForPassenger(Passenger passenger){
        //visszaadja, hogy mennyibe kerülne a foglalás. Ez a metódus még NEM foglal.

    }

    public Passenger findPassengerByName(String name){
        //foglalás megkeresése név alapján

    }

    public List<String> getPassengerNamesOrdered(){
        //visszaadja a foglalást végzők neveit ábécé sorrendben
    }

    public double sumAllBookingsCharged(){
        //összegzi, hogy mennyi az összes bevétel
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        //visszaadja, hogy osztályonként mennyien foglaltak
    }

 */
}

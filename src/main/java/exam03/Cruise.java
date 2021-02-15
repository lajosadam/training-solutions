package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;

    private LocalDate sailing;

    private double basicPrice;

    private List<Passenger> passengers = new ArrayList<>();

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
        if (passengers.size()>20){
            throw new IllegalStateException("Ningy elég hely a hajón!!!");
        }else {
            this.passengers.add(passenger);
        }
    }

    public double getPriceForPassenger(Passenger passenger){
        //visszaadja, hogy mennyibe kerülne a foglalás. Ez a metódus még NEM foglal.
        // LUXURY = 3,0, FIRST = 1,8 és  SECOND = 1,0
        double priceValue = 0.0;
        switch (passenger.getCruiseClass())
        {
            case LUXURY: priceValue += basicPrice * 3.0d;
            break;

            case FIRST: priceValue += basicPrice * 1.8d;
            break;

            case SECOND: priceValue += basicPrice * 1.0d;
            break;
        }
        return priceValue;
    }

    public Passenger findPassengerByName(String name){
        //foglalás megkeresése név alapján
        Passenger returnP = null;
        for (Passenger p : passengers){
            if (p.getName().equals(name)){
                returnP = new Passenger(name, p.getCruiseClass());
            }
        }
    return returnP;
    }

    public List<String> getPassengerNamesOrdered(){
        //visszaadja a foglalást végzők neveit ábécé sorrendben
        List<String> returnList = new ArrayList<>();

        for (Passenger p : passengers){
            returnList.add(p.getName());
        }
        Collections.sort(returnList);
        return returnList;
    }
/*
    public double sumAllBookingsCharged(){
        //összegzi, hogy mennyi az összes bevétel
        //ehhez hiányoznak adatok, pl. hogy hol tárolom a bevételt
    }
 */
    public Map<CruiseClass, Integer> countPassengerByClass(){
        //visszaadja, hogy osztályonként mennyien foglaltak
        Map<CruiseClass, Integer> returnMap = new HashMap<>();
        int firstClassCounter = 0;
        int secondClassCounter = 0;
        int luxuryClassCounter = 0;

        for (Passenger p : passengers){
            if(p.getCruiseClass().equals(CruiseClass.FIRST)){
                firstClassCounter++;
            }else if (p.getCruiseClass().equals(CruiseClass.SECOND)){
                secondClassCounter++;
            }else if (p.getCruiseClass().equals(CruiseClass.LUXURY)){
                luxuryClassCounter++;
            }
        }

        // tudom hogy csúnya de elfáradtam :)
        if(firstClassCounter != 0){
            returnMap.put(CruiseClass.FIRST,firstClassCounter);
        }
        if (secondClassCounter != 0){
            returnMap.put(CruiseClass.SECOND,secondClassCounter);
        }
        if (luxuryClassCounter != 0){
            returnMap.put(CruiseClass.LUXURY,luxuryClassCounter);
        }

        return returnMap;
    }


}

package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(300.56, false);

        System.out.println(distance.getDistanceInKm()+"-"+distance.isExact());

        int e = (int) distance.getDistanceInKm();
        System.out.println(e);
    }

}

package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {


        Restaurant restaurant = new Restaurant("PizzaMonkey", 12);
        restaurant.setMenu("Hamburger");
        restaurant.setMenu("Pizza");
        restaurant.setMenu("Gyros");

        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());

    }
}

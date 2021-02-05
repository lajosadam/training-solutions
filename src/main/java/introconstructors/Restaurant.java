package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menu = new ArrayList<>();

    private String name;

    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = 4 * numberOfTables;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMenu(String menu){
        this.menu.add(menu);
    }
}

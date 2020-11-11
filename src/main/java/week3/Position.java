package week3;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {


        List<Position> list = new ArrayList<>();
        list.add(new Position("Boss", 150_000));
        list.add(new Position("Senior", 50_000));
        list.add(new Position("Medior", 180_000));
        list.add(new Position("Junior", 260_000));

        for (Position i : list){
            if (i.getBonus()>150_000){
                System.out.println(i.toString());
            }
        }


    }
}



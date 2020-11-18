package enaplo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;                    //diák neve
    List<Mark> marks = new ArrayList<>();   //diák adatai (tantárgy, tanár, jegytípus)

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        marks.add(mark);
    }

    public double calculateAverage(){
        double value = 0;
        for (Mark i : marks){
            value += i.getMarkType().getValue();
        }
        return value;
    }

    public double calculateSubjectAverage(Subject subject){
        //tantárgyhoz tartozó átlag számítása
        return 3.3; //csak hogy ne jelezzen hibát
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

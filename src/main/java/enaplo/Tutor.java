package enaplo;

import java.util.List;

public class Tutor {
    private String name;                                //tanár neve
    List<Subject> taughtSubjects;   //tanított tárgyak listája

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        boolean returnValue = false;
        for (Subject i : taughtSubjects){
            if (subject.getSubjectName().equals(i.toString())){
                returnValue = true;
            }
        }
        return returnValue;
    }
}

package enaplo;

public class StudyResultByName {
    private String studentName;     //diák neve
    private double studyAverage;    //diák átlaga

    public StudyResultByName(String studentName, double studyAverage) {
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}

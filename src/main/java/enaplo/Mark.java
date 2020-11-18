package enaplo;

public class Mark {
    MarkType markType;  //osztályzat érték -- enum
    Subject subject;    //tantárgy amiből a jegyet kapta
    Tutor tutor;        //a tanár aki adta a jegyet

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markType=" + markType +
                ", subject=" + subject +
                ", tutor=" + tutor +
                '}';
    }
}

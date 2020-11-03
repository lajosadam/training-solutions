package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {

        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("Java programming");
        note.setText("Second task with methods...");

        System.out.println(note.getNoteText());

    }
}

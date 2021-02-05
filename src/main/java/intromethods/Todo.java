package intromethods;

public class Todo {

    private String name;

    private boolean finished;

    public Todo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return "Todo Lista   " +
                "name:'" + name + '\'' +
                ", Be van fejezve? [" + finished +
                ']';
    }

    public void finish() {
        this.finished = true;
    }

    public static void main(String[] args) {
        Todo todo = new Todo("Porszívózás");
        System.out.println(todo);
    }
}

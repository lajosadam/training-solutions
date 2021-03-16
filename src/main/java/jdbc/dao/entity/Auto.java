package jdbc.dao.entity;


public class Auto {
    private int id;
    private String thing;
    private String thing2;

    public Auto(int id, String thing, String thing2) {
        this.id = id;
        this.thing = thing;
        this.thing2 = thing2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getThing2() {
        return thing2;
    }

    public void setThing2(String thing2) {
        this.thing2 = thing2;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", thing='" + thing + '\'' +
                ", thing2='" + thing2 + '\'' +
                '}';
    }
}

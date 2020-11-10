package enumtype.week;

public enum Day {
    MONDAY("WORKDAY"),
    TUESDAY("WORKDAY"),
    WEDNESDAY("WORKDAY"),
    THURSDAY("WORKDAY"),
    FRIDAY("WORKDAY"),
    SATURDAY("HOLYDAY"),
    SUNDAY("HOLYDAY");

    private final String value;

    Day(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

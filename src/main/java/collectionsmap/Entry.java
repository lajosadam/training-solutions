package collectionsmap;

import java.util.Date;

public class Entry {
    private final String IP;
    private final Date date;
    private final String login;

    public Entry(String IP, Date date, String login) {
        this.IP = IP;
        this.date = date;
        this.login = login;
    }

    public String getIP() {
        return IP;
    }

    public Date getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}

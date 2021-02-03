package collectionsmap;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class LogParser {

    private String date;

    public LogParser(String date) {
        this.date = date;
    }

    public Map<String, List<Entry>> parseLog(String log){

        Map<String, Entry> returnMap = null;

        returnMap.put(date, new Entry("172.168.0.1", new Date(), "login1"));
        returnMap.put(date, new Entry("172.168.0.111", new Date(), "login2"));
        returnMap.put(date, new Entry("172.168.0.150", new Date(), "login3"));

    }


    // Több információ szükséges, a feladat számomra nem tartalmaz elég releváns adatot, hogy megtudjam, hogyan kellene működnie!

}

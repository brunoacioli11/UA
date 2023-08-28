package POO2122;

import java.time.LocalDate;
import java.util.*;

public class Event implements IEvent{
    private List<Activity> actList =  new ArrayList<>();
    private Client c;
    LocalDate eventDate;

    public Event(Client c, LocalDate eventDate) {
        this.c = c;
        this.eventDate = eventDate;
    }

    public LocalDate getDate(){
        return this.eventDate;
    }

    public double eventPrice() {
        double sum = 0;
        for(Activity act: actList) {
            sum += act.getPrice();
        }
        return sum;
    }

    public Event addActivity(Activity activity) {
        actList.add(activity);
        return this;
    }

    @Override
    public String toString() {
        String res = c + " " + eventDate.toString() + "\n";
        for(Activity act: actList) {
            res += act + "\n";
        }
        return res;
    }

}

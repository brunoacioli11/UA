package POO2122;

import java.time.LocalDate;
import java.util.*;

public class EventManager {
    private Map<String, Client> clientMap = new HashMap<>();
    private List<Event> eventList = new ArrayList<>();
    private String eventName;

    public EventManager(String eventName){
        this.eventName = eventName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public Client addClient(String nome, String localidade) {
        Client c = new Client(nome,localidade);
        String local = clientMap.get(nome).getLocalidade();
        assert !local.equals(localidade);
        return c;
    }
    
    public Event addEvent(Client c, LocalDate eventDate) {

        Event e = new Event(c, eventDate);
        eventList.add(e);
        return e;
    }

    public String listClients() {
        String res = "";
        for(Client c: clientMap.values()){
            res += c + "\n";
        }
        return res;
    }

    public String listEvents() {
        String res = "";
        for(Event e : eventList) {
            res += e + "\n";
        }
        return res;
    }
}
